package core_java_made_easy.Java_17_Features.RandomGenerator;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
//        RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("L64X128StarStarRandom").create(233);
        System.out.println(randomGenerator.getClass());

        /***
         * Show all the random generator algorithms
         * to use below algorithms use RandomGeneratorFactory.of("algorithm name").create(pass seed number)
         */
        RandomGeneratorFactory.all().map(factory -> factory.group()+":"+factory.name()).sorted()
                .forEach(System.out::println);

        int i = 0;
        while (i<=10){
            int num = randomGenerator.nextInt(20);
            System.out.println(num);
            i++;
        }

    }
}
