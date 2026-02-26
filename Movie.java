class Movie{

    static String director;
    static int duration;
    static String name;
    static String language;
    static String heroine;
    static int year;
    static String hero;

    public static boolean createMovie(String n,String h,String hr,String d,String l,int y,int du){

        boolean isCreated=false;
        boolean isDirectorValid=false;
        boolean isDurationValid=false;
        boolean isNameValid=false;
        boolean isLanguageValid=false;
        boolean isHeroineValid=false;
        boolean isYearValid=false;
        boolean isHeroValid=false;

        if(d!=null && !d.isEmpty()){
            director=d;
            System.out.println("Director validated : " + d);
            isDirectorValid=true;
        }else{
            System.out.println("Director invalid");
        }

        if(du>0){
            duration=du;
            System.out.println("Duration validated : " + du);
            isDurationValid=true;
        }else{
            System.out.println("Duration invalid");
        }

        if(n!=null && !n.isEmpty()){
            name=n;
            System.out.println("Movie Name validated : " + n);
            isNameValid=true;
        }else{
            System.out.println("Movie Name invalid");
        }

        if(l!=null && !l.isEmpty()){
            language=l;
            System.out.println("Language validated : " + l);
            isLanguageValid=true;
        }else{
            System.out.println("Language invalid");
        }

        if(hr!=null && !hr.isEmpty()){
            heroine=hr;
            System.out.println("Heroine validated : " + hr);
            isHeroineValid=true;
        }else{
            System.out.println("Heroine invalid");
        }

        if(y>1900){
            year=y;
            System.out.println("Year validated : " + y);
            isYearValid=true;
        }else{
            System.out.println("Year invalid");
        }

        if(h!=null && !h.isEmpty()){
            hero=h;
            System.out.println("Hero validated : " + h);
            isHeroValid=true;
        }else{
            System.out.println("Hero invalid");
        }

        if(isDirectorValid && isDurationValid && isNameValid &&
           isLanguageValid && isHeroineValid &&
           isYearValid && isHeroValid){

            isCreated=true;
            System.out.println("All Movie Details Validated\n");
        }
        else{
            System.out.println("Movie Details Invalidated\n");
        }

        return isCreated;
    }

    public static void getMovieDetails(){

        System.out.println("Director : " + director);
        System.out.println("----- Last Movie Stored -----");
        System.out.println("Name : " + name);
        System.out.println("Duration : " + duration);
        System.out.println("Hero : " + hero);
        System.out.println("Heroine : " + heroine);
        System.out.println("Language : " + language);
        System.out.println("Year : " + year);
    }
}
