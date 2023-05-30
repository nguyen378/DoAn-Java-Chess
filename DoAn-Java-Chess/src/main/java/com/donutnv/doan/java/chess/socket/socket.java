/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.donutnv.doan.java.chess.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author nguye
 */
public class socket {
    public static void main(String[] args) {
        final String serverIP = "192.168.1.100"; // Địa chỉ IP của máy chủ
        final int serverPort = 1234;

        try {
            // Kết nối tới server
            Socket socket = new Socket("localhost", serverPort);
            System.out.println("Connected to server: " + serverIP);

            // Lấy luồng dữ liệu vào/ra từ server
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            // Gửi dữ liệu từ client tới server
            Thread sendThread = new Thread(() -> {
                try {
                    while (true) {
                        // Đọc dữ liệu từ bàn phím
                        byte[] buffer = new byte[1024];
                        int bytesRead = System.in.read(buffer);

                        // Gửi dữ liệu tới server
                        outputStream.write(buffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Nhận dữ liệu từ server
            Thread receiveThread = new Thread(() -> {
                try {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        // Hiển thị dữ liệu nhận được từ server
                        System.out.println("Received: " + new String(buffer, 0, bytesRead));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Khởi động hai luồng
            sendThread.start();
            receiveThread.start();

            // Chờ hai luồng kết thúc
            sendThread.join();
            receiveThread.join();

            // Đóng kết nối
            socket.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    }

