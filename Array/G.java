class G {
    public static void main(String[] args) {
        System.out.println(args.length);

        for(String next : args)
            System.out.println(next);

        System.out.println(args[1] + 1);
    }   
}


// >java H mohan 21 78.89 true