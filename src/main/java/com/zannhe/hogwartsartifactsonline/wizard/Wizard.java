package com.zannhe.hogwartsartifactsonline.wizard;

import com.zannhe.hogwartsartifactsonline.artifact.Artifact;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Wizard {

    @Id
    private Integer id;

    private String name;

    @OneToMany
    private List<Artifact> artifacts;

    public Wizard() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", artifacts=" + artifacts +
                '}';
    }
}
