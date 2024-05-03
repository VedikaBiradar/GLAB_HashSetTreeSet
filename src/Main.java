import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

//        HashsetClass hs=new HashsetClass();
//        hs.hashSet();

//         HashsetAddAllMethod hs=new HashsetAddAllMethod();
//         hs.addAllMethod();

//        HashsetRemoveAllMethod hr=new HashsetRemoveAllMethod();
//        hr.removeAll();

//        HashsetEnhancedForLoop hf=new HashsetEnhancedForLoop();
//        hf.enhancedForLoop();

//         Treeset ts = new Treeset();
//         ts.treesetiterator();

//           TreeSetRemoveAllMethod tr=new TreeSetRemoveAllMethod();
//           tr.removeAll();

//           HashsetFirstAndLast hf=new HashsetFirstAndLast();
//           hf.firstAndlast();


        TreeSet<String> cities = new TreeSet<>(new Comparatorclassoverride());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);



    }
}