class user {
    private String event,date1,time1;
    public user(String event, String date1 , String time1)
    {
        this.event=event;
        this.date1=date1;
        this.time1=time1;
    }
    public String getevent(){
        return event;
    }
    public String getdate1()
    {
        return date1;
    }
    public String gettime1()
    {
        return time1;
    }
    
}
