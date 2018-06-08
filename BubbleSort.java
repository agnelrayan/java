/**
 * Created by agnel on 6/1/18.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int a[]={10,29,30,23,12};
        int n=a.length;
        int temp;

        for (int i = 0; i < n; i++)

        {

            for (int j = i + 1; j < n; j++)

            {

                if (a[i] > a[j])

                {

                    temp = a[i];

                    a[i] = a[j];

                    a[j] = temp;

                }

            }

        }

        System.out.print("Ascending Order:");

        for (int i = 0; i < n ; i++)

        {

            System.out.print(a[i] + ",");

        }

    }
}
