package day37_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    ProductOwner PO;
    BusinessAnalyst BA;
    ScrumMaster SM;

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addAllTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addAllDeveloper(Developer [] developer){
        this.developers.addAll(Arrays.asList(developer));
    }

    public void removeTester(int id){
        testers.removeIf(p-> p.id==id);
    }

    public void removeDeveloper(int id){
        developers.removeIf(p-> p.id==id);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", NumberOfTester=" + testers.size() +
                ", NumberOfDeveloper=" + developers.size() +
                '}';
    }
}
