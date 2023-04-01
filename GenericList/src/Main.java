public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(5);
        System.out.println(myList.isEmpty());
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(50);
        myList.add(20);
        System.out.println("Dizideki eleman sayısı : " + myList.size());
        System.out.println("Dizideki toplam kapasite : " + myList.getCapacity());
        System.out.println("Son dolu eleman : " + myList.getLastFullIndex());
        myList.toString();
        myList.add(70);
        System.out.println("Dizideki eleman sayısı : " + myList.size());
        System.out.println("Dizideki toplam kapasite : " + myList.getCapacity());


        System.out.println(myList.get(0));
        System.out.println("----------------------");

        myList.remove(7);
        myList.toString();
        myList.set(5, 25);
        System.out.println(myList.toString());
        System.out.println(myList.indexOf(20));
        System.out.println(myList.lastIndexOf(20));
        System.out.println(myList.isEmpty());
        System.out.println(myList.sublist(0,2));
        System.out.println(myList.contains(10));
        System.out.println(myList.contains(90));
        myList.clear();
        System.out.println(myList.toString());
        System.out.println(myList.isEmpty());

    }
}