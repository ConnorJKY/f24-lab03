package edu.cmu.cs.cs214.rec04;

import java.util.ArrayList;
import java.util.List;

public class SortedIntList extends AbstractIntList {
    private List<Integer> list;
    public SortedIntList() {
        this.list = new ArrayList<>();
    }

    @Override
    public boolean add(int num) {
        int i = 0;
        for(; i < list.size(); ++i){
            if(list.get(i) > num)
                break;
        }
        try{
            list.add(i, (Integer) num);
        }
        catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean addAll(IntegerList newList) {
        for (int i = 0; i != newList.size(); ++ i) {
            if(!this.add((int)newList.get(i)))
                return false;
        }
        return true;
    }

    @Override
    public boolean remove(int num) {
        return list.remove((Integer) num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        int size = list.size();
        for (int i = 0; i != size; i++) {
            if(!this.remove((int) list.get(i)))
                return false;
        }
        return true;
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }
}
