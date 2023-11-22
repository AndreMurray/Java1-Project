public class ArraysExercises {

    public static Person[] addPerson(Person[] peopleArray, Person newPerson) {
        // Create a new array with a length one greater than the original array
        Person[] newArray = new Person[peopleArray.length + 1];

        // Copy elements from the original array to the new array
        System.arraycopy(peopleArray, 0, newArray, 0, peopleArray.length);

        // Add the new person to the end of the new array
        newArray[newArray.length - 1] = newPerson;

        // Return the new array
        return newArray;
    }

    public static void main(String[] args) {
        Person[] originalArray = {new Person("John"), new Person("Alice")};

        Person alven = new Person("alven");

       Person[] newArray = addPerson(originalArray,alven);

        for (Person person: newArray
             ) {
            System.out.println(person.getName());
        }

    }
}
