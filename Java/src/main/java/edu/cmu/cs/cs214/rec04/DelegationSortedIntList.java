package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList{

    private int totalAdded;
    private SortedIntList sortedIntList;

    DelegationSortedIntList(){
        sortedIntList = new SortedIntList();
        totalAdded = 0;
    }

    @Override
    public boolean add(int num) {
        this.totalAdded++;
        return sortedIntList.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        this.totalAdded += list.size();
        return sortedIntList.addAll(list);
    }

    public int getTotalAdded() {
        return this.totalAdded;
    }

    @Override
    public int size() {
        return sortedIntList.size();
    }

    @Override
    public int get(int index) {
        return sortedIntList.get(index);
    }

    @Override
    public boolean remove(int num) {
        return sortedIntList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return sortedIntList.removeAll(list);
    }
}