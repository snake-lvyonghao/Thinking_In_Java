package Chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FilledList<T> {
    private Class<T> type;
    public FilledList(Class<T> type)
    {
        this.type = type;
    }

    public List<T> create(int nElements)
    {
        List<T> result = new ArrayList<>();
        try{
            for(int i = 0;i < nElements;i++)
            {
                result.add(type.newInstance());
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        return result;
    }

    public static void main(String[] args)
    {
        FilledList<Random> f1 = new FilledList<>(Random.class);
        System.out.println(f1.create(15));
    }
}
