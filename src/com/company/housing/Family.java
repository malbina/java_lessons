package com.company.housing;

import java.util.ArrayList;

public class Family {
    private ArrayList<String> members;
    private AbstractHousing homeAddres;

    public Family(ArrayList<String> members, AbstractHousing homeAddres) {
        this.members = members;
        this.homeAddres = homeAddres;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }

    public AbstractHousing getHomeAddres() {
        return homeAddres;
    }

    public void setHomeAddres(AbstractHousing homeAddres) {
        this.homeAddres = homeAddres;
    }
    public void live (){
        System.out.println(homeAddres);
    }
    public int getFamilyMembersNumber (){
        return members.size();
    }
}
