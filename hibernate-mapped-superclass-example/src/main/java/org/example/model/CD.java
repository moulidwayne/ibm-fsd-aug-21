package org.example.model;

import lombok.*;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public  class CD {
    @Column(name = "cd_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cdId;
    @Column(name = "cd_name")
    private String cdName;
    @Column(name = "release_year")
    private String releaseYear;

    @Override
    public String toString() {
        return
                "cd-id: " + cdId +
                " cd-name:" + cdName +
                " release-year: " + releaseYear;
    }
}
