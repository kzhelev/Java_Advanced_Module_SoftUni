package InterfacesAndAbstraction.MilitaryElite;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Private> privates = new LinkedHashMap<>();
        Map<String, LieutenantGeneralImpl> lieutenantGenerals = new LinkedHashMap<>();
        Map<String, EngineerImpl> engineers = new LinkedHashMap<>();
        Map<String, CommandoImpl> commandos = new LinkedHashMap<>();
        Map<String, SpyImpl> spies = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] command = input.split("\\s+");

            String firstName;
            String lastName;
            String id;
            double salary;
            String corp;


            switch (command[0]) {
                case "Private":
                    id = command[1];
                    firstName = command[2];
                    lastName = command[3];
                    salary = Double.parseDouble(command[4]);

                    privates.put(id, new PrivateImpl(id,firstName,lastName,salary));

                    System.out.println(privates.get(id).toString());
                    break;
                case "LieutenantGeneral":
                    id = command[1];
                    firstName = command[2];
                    lastName = command[3];
                    salary = Double.parseDouble(command[4]);

                    lieutenantGenerals.put(id, new LieutenantGeneralImpl(id,firstName,lastName,salary));
                    for (int i = 5; i < command.length; i++) {
                        lieutenantGenerals.get(id).addPrivate(privates.get(command[i]));
                    }

                    System.out.println(lieutenantGenerals.get(id).toString());
                    System.out.println("Privates:");
                    for (Private aPrivate : lieutenantGenerals.get(id).getPrivates()) {
                        System.out.println("  "+aPrivate.toString());
                    }

                    break;
                case "Engineer":

                    id = command[1];
                    firstName = command[2];
                    lastName = command[3];
                    salary = Double.parseDouble(command[4]);
                    corp = command[5];

                    try {
                        engineers.put(id, new EngineerImpl(id,firstName,lastName,salary,corp));

                        for (int i = 6; i < command.length; i += 2) {
                            engineers.get(id).addRepair(new Repair(command[i], Integer.parseInt(command[i+1])));
                        }

                        System.out.println(engineers.get(id).toString());
                        System.out.println("Repairs:");

                        for (Repair repair : engineers.get(id).getRepairs()) {
                            System.out.println(repair.toString());
                        }

                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Commando":

                    id = command[1];
                    firstName = command[2];
                    lastName = command[3];
                    salary = Double.parseDouble(command[4]);
                    corp = command[5];

                    try {
                        commandos.put(id, new CommandoImpl(id,firstName,lastName,salary,corp));
                        System.out.println(commandos.get(id).toString());
                        System.out.println("Missions:");
                    }catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    for (int i = 6; i < command.length; i += 2) {
                        try {
                            commandos.get(id).addMission(new Mission(command[i],command[i+1]));
                        }catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    for (Mission mission : commandos.get(id).getMissions()) {
                        System.out.println(mission.toString());
                    }


                    break;
                case "Spy":

                    id = command[1];
                    firstName = command[2];
                    lastName = command[3];
                    String codeNumber = command[4];

                    spies.put(id,new SpyImpl(id,firstName,lastName,codeNumber));

                    System.out.println(spies.get(id).toString());
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println();
    }
}
