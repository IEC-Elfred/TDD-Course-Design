# 激斗贪食蛇

本游戏基于java swing，是软件质量测试课设，采用TDD开发

##### Contributors:

Elfredwei @elfredwei@gmail.com

RunLuo @809732792@qq.com

ZonghaoLiu @1137990991@qq.com

##### 涉及技术点

swing,多线程,文件读写,多媒体文件播放等

##### 游戏简介

该游戏分为两种模式:单人、双人。
单人模式分3个等级：新手，普通，高手
双人模式分为两种游戏模式：
激斗：抢吃食物，相撞或撞到障碍物,游戏结束,仍存活者获胜
互相伤害：在限定时间内,相互攻击，时间结束时,蛇更长者获胜

##### 项目文件结构

- com
  - snake
    - deal  游戏处理相关
    - enums 枚举类
    -  extra 额外的东西(音乐,文件等等)
    - game 游戏元素(蛇,食物等)
    - swing swing窗口部件
- images 相关图片
- rank 排行榜文件
- sounds 声音文件
- show 游戏界面展示图

其中MySbakeGame为启动类,在swing包中。



##### 游戏界面

![单人-高手](https://github.com/zhangwenkang0/SnakeGame/blob/master/show/单人-高手.png)

![双人-激斗](https://github.com/zhangwenkang0/SnakeGame/blob/master/show/双人-激斗.png)

![双人-相互伤害](https://github.com/zhangwenkang0/SnakeGame/blob/master/show/双人-相互伤害.png)

