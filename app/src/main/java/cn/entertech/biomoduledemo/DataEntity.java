package cn.entertech.biomoduledemo;

import java.util.Arrays;

public class DataEntity {
    private String command;
    private String device_id;
    private int[] data;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public int[] getData() {
        return data;
    }

    public void setInt(int num){

    }
    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataEntity{" +
                "command='" + command + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public String getDevice_id() {
        return device_id;
    }

    public void setDevice_id(String device_id) {
        this.device_id = device_id;
    }
}
