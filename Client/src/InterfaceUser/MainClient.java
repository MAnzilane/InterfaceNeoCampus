/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceUser;

import java.util.Scanner;
import user.User;

/**
 *
 * @author mmadi
 */
public class MainClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        u.runConnSocket(2345, "127.0.0.1"); // demarrage de la socket
        u.login("a1i1s1d149", "ai1008sd");
        boolean continuer = true;
        System.out.println("is connected : "+u.isConnected());
        if (u.isConnected()) {
            u.runRecvePassive(); //demarrage de l'atente 
            u.toString();
            while (continuer) {
                System.out.println("entrer une command :");
                if (u.isConnected()) {
                    switch (sc.nextLine()) {
                        case "sendm":
                            u.sendRequest("");
                            break;
                        case "sendT":
                            u.sendRequest("");
                            break;
                        case "getG":
                            u.sendRequest("");
                            break;
                        case "getM":
                            u.sendRequest("");
                            break;
                        case "getT":
                            u.sendRequest("");
                            break;
                        case "g":
                            u.afficherGroupe();
                            break;
                        case "gb":
                            u.afficherGroupeBox();
                            break;
                        case "m":
                            u.afficherListMsg();
                            break;
                        case "t":
                            u.afficherLisTicket();
                            break;
                        case "c":
                            u.disconnect();
                            continuer = false;
                            break;
                    }
                }
            }
        }

    }
}
