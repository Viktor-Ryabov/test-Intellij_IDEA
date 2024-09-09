package org.example;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Mountain {
    public String name;
    public int hightMountain;

    public String getName() {
        return name;
    }

    public int getHightMountain() {
        return hightMountain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHightMountain(int hightMountain) {
        this.hightMountain = hightMountain;
    }
}
