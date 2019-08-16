package org.smartboot.socket.udp;

import java.net.SocketAddress;

/**
 * @author 三刀
 * @version V1.0 , 2019/8/16
 */
final class ReadEvent<T> {
    private SocketAddress remote;
    private T message;

    public SocketAddress getRemote() {
        return remote;
    }

    public void setRemote(SocketAddress remote) {
        this.remote = remote;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}