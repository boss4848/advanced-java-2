package read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("/Users/passakorn/CS/tutorial/read_file/trial_dataENG.csv");
        BufferedReader reader = new BufferedReader(in);
        Stream<String> lines = reader.lines().skip(1);
        List<Item> list = new ArrayList<>();
        lines.forEach(data -> {
            String[] line = data.split(",");
            Item item = new Item(
                    line[0],
                    line[1],
                    line[2],
                    line[3],
                    line[4],
                    line[5],
                    Float.valueOf(line[6]));
            list.add(item);
        });

        list.stream().forEach((Item item) -> System.out.println(item.getReactionTime()));
        reader.close();
    }
}
