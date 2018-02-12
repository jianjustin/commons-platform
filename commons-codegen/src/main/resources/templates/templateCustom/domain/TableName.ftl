package ${package_name}.domain;
import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

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
    <#if (model.columnType = 'varchar' || model.columnType = 'text')>
    @Column(name = "${model.columnName}",columnDefinition = "${model.columnType}")
    private String ${model.changeColumnName?uncap_first};

    </#if>
    <#if model.columnType = 'timestamp' ||model.columnType = 'datetime' || model.columnType = 'date' || model.columnType = 'time'>
    @Column(name = "${model.columnName}",columnDefinition = "${model.columnType}")
    private Date ${model.changeColumnName?uncap_first};

    </#if>
	<#if model.columnType = 'double'>
    @Column(name = "${model.columnName}",columnDefinition = "${model.columnType}")
    private Double ${model.changeColumnName?uncap_first};

    </#if>
        </#list>
    </#if>

<#if model_column?exists>
<#list model_column as model>
<#if (model.columnType = 'varchar' || model.columnType = 'text')>
    public String get${model.changeColumnName}() {
        return this.${model.changeColumnName?uncap_first};
    }

    public void set${model.changeColumnName}(String ${model.changeColumnName?uncap_first}) {
        this.${model.changeColumnName?uncap_first} = ${model.changeColumnName?uncap_first};
    }

</#if>
<#if model.columnType = 'timestamp' ||model.columnType = 'datetime' || model.columnType = 'date' || model.columnType = 'time'>
    public Date get${model.changeColumnName}() {
        return this.${model.changeColumnName?uncap_first};
    }

    public void set${model.changeColumnName}(Date ${model.changeColumnName?uncap_first}) {
        this.${model.changeColumnName?uncap_first} = ${model.changeColumnName?uncap_first};
    }

</#if>
<#if model.columnType = 'double'>
    public Double get${model.changeColumnName}() {
        return this.${model.changeColumnName?uncap_first};
    }

    public void set${model.changeColumnName}(Double ${model.changeColumnName?uncap_first}) {
        this.${model.changeColumnName?uncap_first} = ${model.changeColumnName?uncap_first};
    }

</#if>
</#list>
</#if>
}