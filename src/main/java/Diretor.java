import javax.persistence.*;
import java.util.List;

@Entity
public class Diretor {
    @Id
    int ID;
    @Column
    String Nome;

    @OneToMany
            @JoinTable(name="midia_diretor", joinColumns = @JoinColumn(name="diretor_id"),
            inverseJoinColumns = @JoinColumn(name="midia_id"))
    List<Midia> Midias;

    public void addMidia(Midia midia){
        Midias.add(midia);
    }

    public Diretor(int ID, String nome) {
        this.ID = ID;
        Nome = nome;
    }
    public Diretor(){

    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
