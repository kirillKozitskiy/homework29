package ISP;

public class TeamLead implements Programmer, Manager{
    @Override
    public void toManage() {
        System.out.println("Team Lead is managing");
    }

    @Override
    public void program() {
        System.out.println("Team Lead is programming");
    }
}
