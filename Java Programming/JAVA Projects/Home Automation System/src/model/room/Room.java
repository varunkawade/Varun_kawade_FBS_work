package model.room;

import java.util.ArrayList;
import java.util.List;

import model.devices.Device;
import model.interfaces.BedRoomAppliance;
import model.interfaces.KitchenAppliance;
import model.interfaces.LivingRoomAppliance;
import model.interfaces.WashRoomAppliance;

public class Room {

    private int roomId;
    private String roomName;
    private List<Device> devices;

    // Constructor
    public Room(int roomId, String roomName) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.devices = new ArrayList<>();
    }

    // Default constructor
    public Room() {
        this.devices = new ArrayList<>();
    }

    // Getters
    public int getRoomId() {
        return roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public List<Device> getDevices() {
        return devices;
    }

    // Setters
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setDevices(List<Device> devices) {
        if (devices != null) {
            this.devices = devices;
        }
    }

    // Check whether device is allowed in room
    public boolean canDeviceBeAdded(Device device) {

        if (device == null || roomName == null) {
            return false;
        }

        switch (roomName.toLowerCase().replace(" ", "").trim()) {

            case "livingroom":
                return device instanceof LivingRoomAppliance;

            case "bedroom":
                return device instanceof BedRoomAppliance;

            case "kitchen":
                return device instanceof KitchenAppliance;

            case "washroom":
                return device instanceof WashRoomAppliance;

            case "dininghall":
            case "corridor":
                return true;

            default:
                return false;
        }
    }

    // Add device
    public boolean addDevice(Device device) {

        if (device == null) {
            return false;
        }

        if (canDeviceBeAdded(device)) {
            devices.add(device);
            return true;
        }

        return false;
    }

    // Get device by name
    public Device getDevice(String deviceName) {

        for (Device d : devices) {

            if (d.getDeviceName().equalsIgnoreCase(deviceName)) {
                return d;
            }
        }

        return null;
    }

    // Remove device by name
    public boolean removeDevice(String deviceName) {

        Device device = getDevice(deviceName);

        if (device != null) {
            devices.remove(device);
            return true;
        }

        return false;
    }

    // Turn ON device
    public boolean turnOnDevice(String deviceName) {

        Device device = getDevice(deviceName);

        if (device != null) {
            device.turnOn();
            return true;
        }

        return false;
    }

    // Turn OFF device
    public boolean turnOffDevice(String deviceName) {

        Device device = getDevice(deviceName);

        if (device != null) {
            device.turnOff();
            return true;
        }

        return false;
    }

    // Show room status
    public void showStatus() {

        System.out.println("Room ID   : " + roomId);
        System.out.println("Room Name : " + roomName);

        if (devices.isEmpty()) {
            System.out.println("No devices in this room");
            return;
        }

        for (Device device : devices) {
            System.out.println(device.showStatus());
        }
    }
}