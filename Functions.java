import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

//Example 3
import java.util.Collections;
import java.util.Arrays;

//Example 4
import java.util.Vector;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

//Example 5
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Functions{
    
    //EXAMPLE 1: COLLECTION EXAMPLE 1
    public static void example1Collection() {
        System.out.println("\n\nEXAMPLE 1: COLLECTION");

        //Different implementations of collection1:
        ArrayList<String> collection1 = new ArrayList<>();
        //List<String> collection1 = new ArrayList<>();
        //List<String> collection1 = new LinkedList<>();

        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.print("A list of cities in collection1: ");
        System.out.println(collection1);

        System.out.print("Is Dallas in collection1? "
        + collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.print("\n\n" + collection1.size() +
        " cities are in collection1 now");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.print("A list of cities in collection2: ");
        System.out.println(collection2);

        //the following creates c1
        //    a new ArrayList that is a copy of collection1
        ArrayList<String> c1 = new ArrayList<String>(collection1);
        System.out.print("Cities in collection1 (c1): ");
        System.out.println(c1);
        c1.addAll(collection2);
        System.out.print("Cities in collection1 or collection2: ");
        System.out.println(c1);

        c1 = new ArrayList<String>(collection1);
        c1.retainAll(collection2);
        System.out.print("Cities in collection1 and collection2: ");
        System.out.println(c1);

        c1 = new ArrayList<String>(collection1);
        c1.removeAll(collection2);
        System.out.print("Cities in collection1, but not in 2: ");
        System.out.println(c1);

        //USING AN ITERATOR
            System.out.print("Print of the collection1 using iterator: ");
            Iterator<String> iterator = collection1.iterator();
            while (iterator.hasNext()){
                System.out.print(iterator.next().toUpperCase() + " ");
            }
            System.out.println();
    }

    public static void example2List(){
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // 1 is autoboxed to new Integer(1)
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);

        System.out.println("\n\nEXAMPLE 2: LISTS");
        System.out.print("A list of integers in the array list:");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);
        linkedList.add(1, "red");
        linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.print("Display the linked list forward:  ");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) 
           System.out.print(listIterator.next() + " ");


        System.out.print("\nDisplay the linked list backward:  ");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious())  
            System.out.print(listIterator.previous() + " ");
        System.out.println(); 
    }

    public static void example3Collections(){
        System.out.println("\n\nEXAMPLE 3: COLLECTIONS");
        System.out.printf("%-50s", "Collections Sort: display sorted list:");
        List<String> list1 = Arrays.asList("red", "green", "blue");
        Collections.sort(list1);
        System.out.println(list1);

        System.out.printf("%-50s","Collections Sort: display reverse ordered list: ");
        List<String> list2 = new ArrayList<> (Arrays.asList("yellow", "red", "green", "blue"));
        Collections.sort(list2, Collections.reverseOrder());
        System.out.println(list2);

        //Combine both lists
        list2.addAll(list1);
        System.out.printf("%-50s","Combination of list 1 and list 2:  ");
        System.out.println(list2);

        System.out.printf("%-50s","Collections binarySearch: find green & Green:  ");
        System.out.print("(1) Index: " + Collections.binarySearch(list2, "green") +  "  ::  ");
        System.out.println("(2) Index: " + Collections.binarySearch(list2, "Green"));

        
        System.out.printf("%-50s","Collections Shuffle: display shuffled list: ");
        Collections.shuffle(list2);
        System.out.println(list2);

        System.out.printf("%-50s","Collections Copy: display new list that copies list3 into list2: ");
        List<String> list3 = Arrays.asList("purple", "orange", "black", "white");
        Collections.copy(list2, list3);
        System.out.println(list2);

        System.out.printf("%-50s","Collections Disjoint: display outcome of testing for disjoint:  ");
        System.out.print(Collections.disjoint(list1, list2) + "  ::  ");
        System.out.println(Collections.disjoint(list1, list3));
    } 

    public static void example4VectorStack(){

        System.out.println("\n\nEXAMPLE 4: VECTOR EXAMPLE");

        Vector<Integer> stack = new Vector<>();  //old school style
        //Stack<Integer> stack = new Stack<>();
        //Deque<Integer> stack = new ArrayDeque<>();

        // Push elements (add to top)
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        System.out.println("Stack Elements: " + stack);

        // Peek (look at the top element)
        int top = stack.lastElement();
        System.out.println("Stack: Top element: " + top);

        // Pop (remove from top)
        stack.remove(stack.size() - 1);
        System.out.println("Stack: After pop: " + stack);

        // Push another element
        stack.add(40);
        System.out.println("Stack: After pushing 40: " + stack);

        // Check if empty
        System.out.println("Stack: Removing All Elements: ");
        while (!(stack.isEmpty())) {
        top = stack.lastElement();
            System.out.print(top + " ");
            stack.remove(stack.size() -1);
        }


        System.out.println("\n\nEXAMPLE 4: STACK EXAMPLE");
        Stack<Character> stack2 = new Stack<>();
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("tacocat", "bubba","a", "mom","abba" ));
        boolean isPal;
        for (String w : wordList){
            //clear stack
            isPal = true;
            stack2.clear();
            for (int i = 0; i < w.length(); i++)
                stack2.push(w.charAt(i));
            for (int i = 0; i < w.length(); i++){
                char stackChar = stack2.peek();
                if (stackChar != w.charAt(i)){
                    isPal = false;
                    break;
                }
                stack2.pop();
            }
            System.out.println("The word: " + w + " is a palindrome? " + isPal);
        }

        
        System.out.println("\n\nEXAMPLE 4: USING ARRAYDEQUE COMMANDS FOR PALINDROME");
        Deque<Character> stack3 = new ArrayDeque<>();
        for (String w : wordList){
            //clear stack
            isPal = true;
            stack3.clear();
            for (int i = 0; i < w.length(); i++)
                stack3.push(w.charAt(i));
            for (int i = 0; i < w.length(); i++){
                char stackChar = stack3.peek();
                if (stackChar != w.charAt(i)){
                    isPal = false;
                    break;
                }
                stack3.pop();
            }
            System.out.println("The word: " + w + " is a palindrome? " + isPal);
        }
    } 

    public static void example5Queue(){
        System.out.println("\n\nEXAMPLE 5: USING QUEUES");
        Queue<String> queue = new java.util.LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        while (queue.size() > 0)
            System.out.print(queue.remove() + " ");
       

        System.out.println("\n\nEXAMPLE 5: USING PRIORITYQUEUES");
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");

        System.out.print("Priority Queue: Using Comparable:  ");
        while (queue1.size() > 0) {
             System.out.print(queue1.remove() + " ");
        }

        PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder());
        queue2.offer("Oklahoma");
        queue2.offer("Indiana");
        queue2.offer("Georgia");
        queue2.offer("Texas");

        System.out.print("\nPriority Queue: Using Comparator:  ");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }

        //creating your own custom comparator
        PriorityQueue<String> queue3 = new PriorityQueue<>(Comparator.comparingInt(String::length).reversed());
        queue3.offer("Oklahoma");
        queue3.offer("Indiana");
        queue3.add("Georgia");
        queue3.add("Texas");
        System.out.print("\nPriority Queue: Using Custom Comparator:  ");
        while (queue3.size() > 0) {
            System.out.print(queue3.remove() + " ");
        }
    }

    public static void example7Sets(){
        System.out.println("\n\nEXAMPLE 7: USING HASHSETS");
        Set<String> set1 = new java.util.HashSet<>();
        
        // Add strings to set1
        set1.add("London");
        set1.add("Paris");
        set1.add("New York");
        set1.add("San Francisco");
        set1.add("Beijing");
        
        System.out.print("set1: " + set1);
        System.out.println(". There are " + set1.size() + " elements in set1");
        
        // Delete a string from set1
        set1.remove("London");
        System.out.print("set1: " + set1);
        System.out.println(". There are " + set1.size() + " elements in set1");
        
        // Create set2
        Set<String> set2 = new java.util.HashSet<>();
        
        // Add strings to set2
        set2.add("London");
        set2.add("Shanghai");
        set2.add("Paris");
        System.out.print("\nset2 : " + set2);
        System.out.println(". There are " + set2.size() + " elements in set2");
        System.out.println("\nIs Taipei in set2? " + set2.contains("Taipei"));
        
        set1.addAll(set2);
        System.out.println("\nAfter adding set2 to set1, set1 is " + set1);
        
        set1.removeAll(set2);
        System.out.println("After removing set2 from set1, set1 is " + set1);
        
        set1.retainAll(set2);
        System.out.println("After removing common elements in set2 " 
                           + "from set1, set1 is " + set1);


        System.out.println("\n\nEXAMPLE 7: USING TREESETS");

        TreeSet<Student> students = new TreeSet<>(new StudentComparator());

        students.add(new Student(1, "Smith", "Alice", "Biology"));
        students.add(new Student(2, "Jackson", "Bob", "Mathematics"));
        students.add(new Student(3, "Smith", "Brian", "Chemistry"));
        students.add(new Student(4, "Adams", "Carol", "Computer Science"));

        Student s1 = new Student(5, "Adams", "Wednesday", "Engineering");
        Student s2 = new Student(5, "Jackson", "Percy", "Engineering");
        students.add(s1);
        students.add(s2);
        students.add(s2);   //try to add the same element 2x

        // Use the methods in SortedSet interface
        System.out.println("first(): " + students.first());
        System.out.println("last():  " + students.last());


        System.out.println("Students sorted by last name, then first name:\n");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("\nlower(Percy Jackson):      " + students.lower(s2));     //element < Percy
        System.out.println("higher(Percy Jackson):     " + students.higher(s2));    //element > Percy

        System.out.println("\nheadSet(Wednesday Adams):   " +  students.headSet(s1));
        System.out.println("headSet(Percy Jackson):     " + students.headSet(s2));   //all elements < Percy
        System.out.println("tailSet(Percy Jackson):     " + students.tailSet(s2));   //all elements >= Percy

        System.out.println("\npollFirst():                " + students.pollFirst());   //removes first element in the tree
        System.out.println("pollLast():                 " + students.pollLast());    //removes last element in the tree
        System.out.println("\nNew tree set:               " + students);
    }
}