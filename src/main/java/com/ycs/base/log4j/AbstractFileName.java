package com.ycs.base.log4j;

public abstract class AbstractFileName implements IFileName {
	protected String _name = null;
	protected int _lineLength = -1;
	protected boolean _isFixedSizeable = true;

	public AbstractFileName(String name, int lineLength) {
		this._name = name;
		this._lineLength = lineLength;
	}

	public AbstractFileName(String name, int lineLength, boolean fixSizeable) {
		this._name = name;
		this._lineLength = lineLength;
		this._isFixedSizeable = fixSizeable;
	}

	public AbstractFileName(String name) {
		this._name = name;
	}

	public int getLineLength() {
		return this._lineLength;
	}

	public void setLineLength(int lineLength) {
		this._lineLength = lineLength;
	}

	public boolean isFixedSizeable() {
		return this._isFixedSizeable;
	}

	public void setFixedSizeable(boolean isFixedSize) {
		this._isFixedSizeable = isFixedSize;
	}

	public String name() {
		return this._name;
	}

	public String toString() {
		return this._name + ":" + this._lineLength + ":" + this._isFixedSizeable;
	}


}
