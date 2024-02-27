package core_java_made_easy.Java_12_Features.Collectors;

import java.util.List;

public class Result {
    private Long count;
    List<Integer> filter;

    public Result(Long count, List<Integer> filter) {
        this.count = count;
        this.filter = filter;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Integer> getFilter() {
        return filter;
    }

    public void setFilter(List<Integer> filter) {
        this.filter = filter;
    }

    @Override
    public String toString() {
        return "Result{" +
                "count=" + count +
                ", filter=" + filter +
                '}';
    }
}
