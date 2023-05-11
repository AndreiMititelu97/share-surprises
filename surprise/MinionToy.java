package surprise;

public class MinionToy implements ISurprise{
    private static final String[] names = { "Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim" };

    private String name;

    private static int nameCounter = 0;

    public MinionToy(String name) {
        this.name = name;
    }

    @Override
    public void enjoy() {
        System.out.format("You got a minion named %s!\n", this.name);
    }

    @Override
    public String toString() {
        return String.format("[Minion] name = %s\n", this.name);
    }

    public static MinionToy generate() {
        if(nameCounter == names.length){
            nameCounter = 0;
        }
        return new MinionToy(names[nameCounter++]);
    }

    public static void main(String[] args){
        MinionToy m1 = MinionToy.generate();
        m1.enjoy();
        MinionToy m2 = MinionToy.generate();
        m2.enjoy();
        MinionToy m3 = MinionToy.generate();
        m3.enjoy();
        MinionToy m4 = MinionToy.generate();
        m4.enjoy();
    }
}
