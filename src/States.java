public class States {

    private String name;
    private String capital;
    private String nickname;
    private String population;

    public States(String name, String capital, String nickname, String population) {
        this.name = name;
        this.capital = capital;
        this.nickname = nickname;
        this.population = population;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getCapital() {return capital;}

    public void setCapital(String capital) {this.capital = capital;}

    public String getNickname() {return nickname;}

    public void setNickname(String nickname) {this.nickname = nickname;}

    public String getPopulation() {return population;}

    public void setPopulation(String population) {this.population = population;}

    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", nickname='" + nickname + '\'' +
                ", population='" + population + '\'' +
                '}';
    }
}
