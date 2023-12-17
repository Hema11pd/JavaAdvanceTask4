package JavaAdvanceTask4;

class Voter {
    private final int voterId;
    private final String name;
    private final int age;

    public Voter(int voterId, String name, int age) throws Exception {
        if (age < 18) {
            throw new Exception("Invalid age for voter. Must be 18 or older.");

        }
        else {
            System.out.println("You are eligible to vote");
        }

        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) throws Exception {
        Voter voter1 = new Voter(5678,"hemapriya",19);
        Voter voter2 = new Voter(5679,"hemapriyaDharshini",17);



    }
}
