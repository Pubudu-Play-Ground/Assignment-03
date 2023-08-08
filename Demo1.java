import java.util.Scanner;

public class Demo1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = input.nextLine();
        if (name.strip().length()==0){
            System.out.println("\033[31mInvalid Input");
            
        } else{
            System.out.print("Enter Your Age : ");
            int age = input.nextInt();
            if (age<10 | age >18){
                System.out.println("\033[31mInvalid Input");
            } else{
                System.out.print("Enter Subject 1 : ");
                input.nextLine();
                String sub1 = input.nextLine();
                if (sub1.strip().length()==0 | !sub1.startsWith("SE-")){
                    System.out.println("\033[31mInvalid Input");
                } else{
                    System.out.print("Enter Marks : ");
                    double mark1 = input.nextDouble();
                    if(mark1<0 | mark1>100){
                        System.out.println("\033[31mInvalid Input");
                    } else{
                        System.out.print("Enter Subject 2 : ");
                        input.nextLine();
                        String sub2 = input.nextLine();
                        if (sub2.strip().length()==0 || !sub2.startsWith("SE-") || sub1.equals(sub2)){
                            System.out.println("\033[31mInvalid Input");
                        } else{
                            System.out.print("Enter Marks : ");
                            double mark2 = input.nextDouble();
                            if(mark2<0 | mark2>100){
                                System.out.println("\033[31mInvalid Input");
                            } else{
                                System.out.print("Enter Subject 3 : ");
                                input.nextLine();
                                String sub3 = input.nextLine();
                                if (sub3.strip().length()==0 || !sub3.startsWith("SE-") || sub2.equals(sub3)){
                                    System.out.println("\033[31mInvalid Input");
                                } else{
                                    System.out.print("Enter Marks : ");
                                    double mark3 = input.nextDouble();
                                    if(mark3<0 | mark3>100){
                                        System.out.println("\033[31mInvalid Input");
                                    } else{
                                        double total = mark1+mark2+mark3;
                                        double avg = total/3;

                                        String status1 = mark1>=75?"\033[34mCredit Pass\033[0m":mark1>=55 & mark1<75?"\033[35mPass\033[0m":"\033[36mFail\033[0m";
                                        String status2 = mark2>=75?"\033[34mCredit Pass\033[0m":mark2>=55 & mark2<75?"\033[35mPass\033[0m":"\033[36mFail\033[0m";
                                        String status3 = mark3>=75?"\033[34mCredit Pass\033[0m":mark3>=55 & mark3<75?"\033[35mPass\033[0m":"\033[36mFail\033[0m";
                                        String status = avg>=75?"\033[34mCredit Pass":avg>=55 & avg<75?"\033[35mPass":"\033[36mFail";
                                        
                                        System.out.println("-".repeat(50));
                                        System.out.printf("| %-8s : \033[34:1m%-36s\033[0m|\n","Name ",name.toUpperCase());
                                        System.out.printf("| %-8s : %-36s|\n","Age ",age+" year old");
                                        System.out.printf("| %-8s : \033[34:1m%-41s\033[0m|\n","Status ",status);
                                        System.out.printf("| %-8s : %-10s %-8s : %-6.2f|\n","Total ",total,"Avg",avg);

                                        System.out.println("-".repeat(50));
                                        System.out.printf("| %-13s | %-13s | %-14s |\n","Subjects","Marks","Status");
                                        System.out.println("-".repeat(50));
                                        System.out.printf("| SE-%03d"+" ".repeat(7)+" | %-13.2f | %-23s |\n",Integer.valueOf(sub1.substring(3)),mark1,status1);
                                        System.out.printf("| SE-%03d"+" ".repeat(7)+" | %-13.2f | %-23s |\n",Integer.valueOf(sub2.substring(3)),mark2,status2);
                                        System.out.printf("| SE-%03d"+" ".repeat(7)+" | %-13.2f | %-23s |\n",Integer.valueOf(sub3.substring(3)),mark3,status3);
                                        System.out.println("-".repeat(50));
                                    
                                    }
                                }
                            }
                        }
                    }
                }                   
            }
        }
    }
}