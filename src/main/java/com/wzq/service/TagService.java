package com.wzq.service;


import com.wzq.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TagService {
    Tag saveTag(Tag type);

    Tag getTag(Long id);

    Tag getTagByName(String name);

    Page<Tag> listTag(Pageable pageable);

    Tag updateTag(Long id, Tag type);

    List<Tag> listTagTop(Integer size);

    void deleteTag(Long id);

    List<Tag> listTag();

    List<Tag> listTag(String ids);
}
