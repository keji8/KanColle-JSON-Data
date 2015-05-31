# KanColle JSON Data #

因为个人开发需要而整理的**舰队Collection**的 JSON 格式基础数据。请自由取用。

## 说明 ##

1. 基于 [http://wikiwiki.jp/kancolle/](http://wikiwiki.jp/kancolle/) 整理，非官方数据，也非游戏解包，不能保证100%正确。
2. 实体之间有关联关系，但考虑到通用性，JSON数据是完全扁平化的。
3. jpaentity文件夹下是加了JPA注解的Java类。如果使用Java，可以利用这些类，用JSON序列化库反序列化后，再配合支持JPA注解的ORM框架（例如Hibernate）持久化到数据库。
4. 为了和JSON数据的格式一致，关联字段只声明了关联实体的主键属性，并没有写成嵌套实体类的形式。
5. 暂时只整理了舰船的数据，根据个人开发需要，持续更新、勘误。

## 实体关联 ##

	参照ER图

## 属性说明 ##

如果没有特殊说明，均为整型

#### Ship 舰船 ####

----------

**shipNo / remodelingStage**

	联合主键。
	前者为没有实际含义的主键编号，后者为改修阶段。
	没有改过的船的remodelingStage为0，改是1，改二是2，以此类推。例如比较典型的千代田的数据是这样子的：

![](http://reimuyome.github.io/kancollejsondata/pics/chiyoda.png)

	这么设计的原因是原始数据中没有任何适合做主键的值，同时可以比较方便地查询一组数据，
	对于任何一艘船，也可以快速查出它的上一个 / 下一个阶段的数据。

	例如使用下面的SQL（Oracle 11g环境）来生成wiki舰船详情页面上的改修流程描述:

 SQL:

	SELECT
	LISTAGG (
		NAME || ' (Lv ' || MINIMUM_LEVEL ||
	 CASE USE_BLUEPRINT
	 WHEN 1 THEN
			' + 改修設計図)'
	 ELSE
			')'
	 END,
	 	' -> '
	) WITHIN GROUP (ORDER BY REMODELING_STAGE ASC) AS remodeling
	FROM
		KANCOLLE_SHIP
	WHERE
		ship_no = 24 

 输出：
	
![](http://reimuyome.github.io/kancollejsondata/pics/remodeling.png)

**illustrationNo**

	图鉴编号

**minimumLevel**

	改修等级，可以直接获取的是1，需要改修得来的是对应的改修等级。

**useBlueprint（布尔型）**

	是否需要设计图来改修。

**name / kana**

	日文汉字名·日文假名。
	有些没有特别标注假名的船kana为空。
	
**shipClass（字符串） / ordinal**

	船型，例如陆奥是长门型战舰。
	同型舰中的第几艘，例如陆奥是长门型的第二艘，这里就是2。
	有的船没有船型，这个属性为空。

**typeID**

	舰种ID，多对一关联ShipType的外键

**xxInit / xxMax**

	各种属性的初始值 / 最大值。
	关于最大运luckMax，wiki上只统计了所有船最终形态的最大运数值，所以有很多船没有这个数据。

**durability**

	耐久（生命值）

**speed（字符串）**

	速度

**range（字符串）**

	射程

**aircrafts**

	总搭载数

**fuel**

	消耗燃油

**ammo**

	消耗弹药

**CV（字符串）**

	声优名，未公布是 '未発表'

**illustrator（字符串）**

	画师，未公布是 '未発表'

#### ShipType 舰种 ####

----------

**typeID**

	舰种ID，没有实际意义。
	一对多关联Ship里的TypeID

**typeName（字符串）**

	舰种名称