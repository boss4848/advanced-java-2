import java.util.function.Consumer;

public class ConsImp implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println(t);
    }

}
