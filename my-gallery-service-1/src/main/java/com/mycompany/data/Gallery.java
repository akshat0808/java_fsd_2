package com.mycompany.data;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Gallery {

private Long galleryId;
private List<Object> images;


}
