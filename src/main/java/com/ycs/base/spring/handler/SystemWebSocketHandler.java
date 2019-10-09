package com.ycs.base.spring.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import com.ycs.basbo.constants.Constants;

/**
 * @description WebSocketHandler处理器
 * @author youcyousyunn
 * @date 2018年11月24日
 */
@Component
public class SystemWebSocketHandler implements WebSocketHandler {
	private static final List<WebSocketSession> webSocketSessionList = new ArrayList<>();

	
	public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
	}
	
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		webSocketSessionList.add(session);
		String usrNo = (String) session.getAttributes().get(Constants.USER_SESSION_USRNO);
		if (usrNo != null) {
			;
		}
	}

	public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
		if (session.isOpen()) {
			session.close();
		}
		webSocketSessionList.remove(session);
	}

	public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
		webSocketSessionList.remove(session);
	}

	public boolean supportsPartialMessages() {
		return false;
	}

	public void sendMessageToUsers(TextMessage message) {
		Iterator<WebSocketSession> iterator = webSocketSessionList.iterator();
		while (iterator.hasNext()) {
			WebSocketSession webSocketSession = (WebSocketSession) iterator.next();
			try {
				if (webSocketSession.isOpen()) {
					webSocketSession.sendMessage(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void sendMessageToUser(String usrNo, TextMessage message) {
		Iterator<WebSocketSession> iterator = webSocketSessionList.iterator();
		while (iterator.hasNext()) {
			WebSocketSession webSocketSession = (WebSocketSession) iterator.next();
			if (webSocketSession.getAttributes().get(Constants.USER_SESSION_USRNO).equals(usrNo)) {
				try {
					if (webSocketSession.isOpen()) {
						webSocketSession.sendMessage(message);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}
	

}
