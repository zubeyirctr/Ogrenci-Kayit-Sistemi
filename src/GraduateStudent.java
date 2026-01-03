public class GraduateStudent extends Student {
    private String thesisTopic;

    public GraduateStudent(String name, String id, String thesisTopic) {
        super(name, id);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    @Override
    public void register() {
        System.out.println("SİSTEM: Lisansüstü öğrenci kaydı yapıldı. Tez Konusu: " + thesisTopic);
    }
}