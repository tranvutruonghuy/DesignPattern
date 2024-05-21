package BuilderPattern1;

import java.util.Scanner;

public class Client {
    public static Contract requestCreateRentalContract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which contract do you want to create?");
        System.out.println("1. Permanent");
        System.out.println("2. Long term");
        System.out.println("3. Permanent");
        int choose = sc.nextInt();
        ContractBuilder builder;
        if (choose == 1) {
            builder = new Permanent();
        } else if (choose == 2) {
            builder = new LongTerm();
        } else {
            builder = new ShortTerm();
        }
        System.out.println("Contract ID: ");
        builder.buildContractID(sc.next());

        System.out.println("Property ID: ");
        builder.buildPropertyID(sc.next());

        System.out.println("Tenant ID: ");
        builder.buildTenantID(sc.next());

        System.out.println("Rent amount: ");
        builder.buildRentAmount(sc.nextDouble());

        return builder.signContract();

    }

    public static void main(String[] args) {
        System.out.println(Client.requestCreateRentalContract());
    }

}
