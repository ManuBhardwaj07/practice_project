class I {
    public static void main(String[] args) {
        System.out.println(args.length);

        for(String next : args)
            System.out.println(next);
    }   
}


// >java I mohan kumar shastri 21 78.89 true
// >java I "mohan kumar shastri" 21 78.89 true