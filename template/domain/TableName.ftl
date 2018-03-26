package ${package_name}.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：${table_name}模型
* @author tools
*/
@Entity
@Table(name="${table_name}")
public class ${TableName}{
	
    <#if model_column?exists>
        <#list model_column as model>
    /**
    *${model.columnComment!}
    */
    <#if (model.columnType = 'bigint')>
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
    @Column(name = "${model.columnName}",columnDefinition = "${model.columnType}")
    private Long ${model.modelName?uncap_first};

    </#if>
    <#if (model.columnType = 'varchar' || model.columnType = 'text')>
    @Column(name = "${model.columnName}",columnDefinition = "${model.columnType}")
    private String ${model.modelName?uncap_first};

    </#if>
    <#if model.columnType = 'timestamp' ||model.columnType = 'datetime' || model.columnType = 'date' || model.columnType = 'time'>
    @Column(name = "${model.columnName}",columnDefinition = "${model.columnType}")
    private Date ${model.modelName?uncap_first};

    </#if>
	<#if model.columnType = 'double'>
    @Column(name = "${model.columnName}",columnDefinition = "${model.columnType}")
    private Double ${model.modelName?uncap_first};

    </#if>
        </#list>
    </#if>

<#if model_column?exists>
<#list model_column as model>
<#if (model.columnType = 'bigint')>
    public Long get${model.modelName}() {
        return this.${model.modelName?uncap_first};
    }

    public void set${model.modelName}(Long ${model.modelName?uncap_first}) {
        this.${model.modelName?uncap_first} = ${model.modelName?uncap_first};
    }

</#if>
<#if (model.columnType = 'varchar' || model.columnType = 'text')>
    public String get${model.modelName}() {
        return this.${model.modelName?uncap_first};
    }

    public void set${model.modelName}(String ${model.modelName?uncap_first}) {
        this.${model.modelName?uncap_first} = ${model.modelName?uncap_first};
    }

</#if>
<#if model.columnType = 'timestamp' ||model.columnType = 'datetime' || model.columnType = 'date' || model.columnType = 'time'>
    public Date get${model.modelName}() {
        return this.${model.modelName?uncap_first};
    }

    public void set${model.modelName}(Date ${model.modelName?uncap_first}) {
        this.${model.modelName?uncap_first} = ${model.modelName?uncap_first};
    }

</#if>
<#if model.columnType = 'double'>
    public Double get${model.modelName}() {
        return this.${model.modelName?uncap_first};
    }

    public void set${model.modelName}(Double ${model.modelName?uncap_first}) {
        this.${model.modelName?uncap_first} = ${model.modelName?uncap_first};
    }

</#if>
</#list>
</#if>
}