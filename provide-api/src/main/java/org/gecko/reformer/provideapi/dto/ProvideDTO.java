package org.gecko.reformer.provideapi.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.gecko.reformer.entity.BaseEntity;

/**
 * ProvideDTO
 *
 * @author LZC
 * @version 1.0.0
 * @date 2021/08/23
 **/
@Data
@ApiModel(description = "ProvideDTO")
public class ProvideDTO extends BaseEntity {
    private static final long serialVersionUID = 3100629455141758024L;
    /**
     * 名称
     **/
    private String name;
    /**
     * 年龄
     **/
    private Integer age;
}
