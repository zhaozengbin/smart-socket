package org.smartboot.socket.extension.decoder.p2p;

import org.smartboot.socket.extension.decoder.p2p.message.BaseMessage;

/**
 * 消息处理Handler
 * 
 * @author 三刀
 * @version MessageHandler.java, v 0.1 2017年1月18日 上午11:18:28 Seer Exp.
 */
public abstract class MessageHandler {
	public void init() {
	}

	public abstract void handler(Session<BaseMessage> session, BaseMessage message);

	public void destory() {
	}
}