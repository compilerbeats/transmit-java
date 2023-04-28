package edu.plus.cs.packet;

import java.io.Serializable;
import java.util.Arrays;

public class DataPacketBody extends PacketBody implements Serializable {
    byte[] data;

    public DataPacketBody(byte[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataPacketBody{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
