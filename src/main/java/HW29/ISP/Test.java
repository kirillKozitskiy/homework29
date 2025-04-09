package HW29.ISP;

public class Test {
    public static void main(String[] args) {
        TeamLead igor = new TeamLead();
        igor.program();
        igor.toManage();

        FactoryWorker petr = new FactoryWorker();
        petr.build();

    }
}
