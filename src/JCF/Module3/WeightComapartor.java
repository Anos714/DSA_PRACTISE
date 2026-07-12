package JCF.Module3;

import java.util.Comparator;

public class WeightComapartor implements Comparator<Student> {


@Override
    public int compare(Student o1,Student o2){
    return Double.compare(o1.weight,o2.weight);
}
}
