# Linux

## 1.Linux目录结构

![](/img/微信截图_20171102134832.png)

| 目录   | 说明                                       |
| ---- | ---------------------------------------- |
| bin  | 存放二进制可执行文件(ls,cat,mkdir等)                |
| boot | 存放用于系统引导时使用的各种文件                         |
| dev  | 用于存放设备文件                                 |
| etc  | 存放系统配置文件                                 |
| home | 存放所有用户文件的根目录                             |
| lib  | 存放跟文件系统中的程序运行所需要的共享库及内核模块                |
| mnt  | 系统管理员安装临时文件系统的安装点                        |
| opt  | 额外安装的可选应用程序包所放置的位置                       |
| proc | 虚拟文件系统，存放当前内存的映射                         |
| root | 超级用户目录                                   |
| sbin | 存放二进制可执行文件，只有root才能访问                    |
| tmp  | 用于存放各种临时文件                               |
| usr  | 用于存放系统应用程序，比较重要的目录/usr/local 本地管理员软件安装目录 |
| var  | 用于存放运行时需要改变数据的文件                         |

## 2.Linux常用命令

**所有命令都可以使用 命令  --help来查看该命令的帮助文档**

### 2.1操作文件目录命令

| 命令    | 说明                | 语法                                       | 参数    | 参数说明              |
| ----- | ----------------- | ---------------------------------------- | ----- | ----------------- |
| ls    | 显示文件和目录列表         | ls [-alrtAFR] [name...]                  |       |                   |
|       |                   |                                          | -l    | 列出文件的详细信息         |
|       |                   |                                          | -a    | 列出当前目录所有文件，包含隐藏文件 |
| mkdir | 创建目录              | mkdir [-p] dirName                       |       |                   |
|       |                   |                                          | -p    | 父目录不存在情况下先生成父目录   |
| cd    | 切换目录              | cd [dirName]                             |       |                   |
| touch | 生成一个空文件           |                                          |       |                   |
| echo  | 生成一个带内容文件         | echo abcd > 1.txt，echo 1234 >> 1.txt     |       |                   |
| cat   | 显示文本文件内容          | cat [-AbeEnstTuv] [--help] [--version] fileName |       |                   |
| cp    | 复制文件或目录           | cp [options] source dest                 |       |                   |
| rm    | 删除文件              | rm [options] name...                     |       |                   |
|       |                   |                                          | -f    | 强制删除文件或目录         |
|       |                   |                                          | -r    | 同时删除该目录下的所有文件     |
| mv    | 移动文件或目录           | mv [options] source dest                 |       |                   |
| find  | 在文件系统中查找指定的文件     |                                          |       |                   |
|       |                   |                                          | -name | 文件名               |
| grep  | 在指定的文本文件中查找指定的字符串 |                                          |       |                   |
| tree  | 用于以树状图列出目录的内容     |                                          |       |                   |
| pwd   | 显示当前工作目录          |                                          |       |                   |
| ln    | 建立软链接             |                                          |       |                   |
| more  | 分页显示文本文件内容        |                                          |       |                   |
| head  | 显示文件开头内容          |                                          |       |                   |
| tail  | 显示文件结尾内容          |                                          |       |                   |
|       |                   |                                          | -f    | 跟踪输出              |

### 2.2 系统管理命令

| 命令       | 说明                      |
| -------- | ----------------------- |
| stat     | 显示指定文件的相关信息,比ls命令显示内容更多 |
| who      | 显示在线登录用户                |
| hostname | 显示主机名称                  |
| uname    | 显示系统信息                  |
| top      | 显示当前系统中耗费资源最多的进程        |
| ps       | 显示瞬间的进程状态               |
| du       | 显示指定的文件（目录）已使用的磁盘空间的总量  |
| df       | 显示文件系统磁盘空间的使用情况         |
| free     | 显示当前内存和交换空间的使用情况        |
| ifconfig | 显示网络接口信息                |
| ping     | 测试网络的连通性                |
| netstat  | 显示网络状态信息                |
| clear    | 清屏                      |
| kill     | 杀死一个进程                  |

### 2.3 关机重启命令

shutdown 命令可以用来进行关机程序，并且在关机以前传送讯息给所有使用者正在执行的程序，shutdown 也可以用来重开机。

| 命令       | 语法                                       | 参数         | 参数说明                             |
| -------- | ---------------------------------------- | ---------- | -------------------------------- |
| shutdown | shutdown [-t seconds] [-rkhncfF] time [message] |            |                                  |
|          |                                          | -t seconds | 设定在几秒钟之后进行关机程序                   |
|          |                                          | -k         | 并不会真的关机，只是将警告讯息传送给所有只用者          |
|          |                                          | -r         | 关机后重新开机（重启）                      |
|          |                                          | -h         | 关机后停机                            |
|          |                                          | -n         | 不采用正常程序来关机，用强迫的方式杀掉所有执行中的程序后自行关机 |
|          |                                          | -c         | 取消目前已经进行中的关机动作                   |
|          |                                          | -f         | 关机时，不做 fcsk 动作(检查 Linux 档系统)     |
|          |                                          | -F         | 关机时，强迫进行 fsck 动作                 |
|          |                                          | time       | 设定关机的时间                          |
|          |                                          | message    | 传送给所有使用者的警告讯息                    |

- **重启**
  - reboot
  - shutdown -r now


- **关机**
  - shutdown -h now

### 2.4 压缩命令

- ## tar

| 命令   | 语法                            | 参数   | 参数说明              |
| ---- | ----------------------------- | ---- | ----------------- |
| tar  | tar [-cxzjvf] 压缩打包文档的名称 欲打包目录 |      |                   |
|      |                               | -c   | 建立一个归档文件的参数指令     |
|      |                               | -x   | 解开一个归档文件的参数指令     |
|      |                               | -z   | 是否需要用 gzip 压缩     |
|      |                               | -j   | 是否需要用 bzip2 压缩    |
|      |                               | -v   | 压缩的过程中显示文件        |
|      |                               | -f   | 使用档名，在 f 之后要立即接档名 |
|      |                               | -tf  | 查看归档文件里面的文件       |

**例子：**

- 压缩文件夹：`tar -zcvf test.tar.gz test\`
- 解压文件夹：`tar -zxvf test.tar.gz`


- ## gzip

| 命令   | 语法                    | 参数   | 参数说明                                     |
| ---- | --------------------- | ---- | ---------------------------------------- |
| gzip | gzip [选项] 压缩（解压缩）的文件名 |      |                                          |
|      |                       | -d   | 解压缩                                      |
|      |                       | -l   | 对每个压缩文件，显示压缩文件的大小，未压缩文件的大小，压缩比，未压缩文件的名字  |
|      |                       | -v   | 对每一个压缩和解压的文件，显示文件名和压缩比                   |
|      |                       | -num | 用指定的数字num调整压缩的速度，-1或--fast表示最快压缩方法（低压缩比），-9或--best表示最慢压缩方法（高压缩比）。系统缺省值为6 |

说明：压缩文件后缀为 gz

- ## bzip2

| 命令    | 语法           | 参数   | 参数说明                                     |
| ----- | ------------ | ---- | ---------------------------------------- |
| bzip2 | bzip2 [-cdz] |      |                                          |
|       |              | -d   | 解压缩                                      |
|       |              | -z   | 压缩参数                                     |
|       |              | -num | 用指定的数字num调整压缩的速度，-1或--fast表示最快压缩方法（低压缩比），-9或--best表示最慢压缩方法（高压缩比）。系统缺省值为6 |

说明：压缩文件后缀为 bz2

## 3.Linux编辑器

- ## vim

  - ### 运行模式

    - 编辑模式：等待编辑命令输入


    - 插入模式：编辑模式下，输入 `i` 进入插入模式，插入文本信息


    - 命令模式：在编辑模式下，输入 `:` 进行命令模式


  - ### 命令

    - `:q` 直接退出vi


    - `:wq` 保存后退出vi ，并可以新建文件


    - `:q!` 强制退出


    - `:w file` 将当前内容保存成某个文件


    - `:set number` 在编辑文件显示行号


    - `:set nonumber`	在编辑文件不显示行号

- ## nano

  nano 是一个字符终端的文本编辑器，有点像 DOS 下的 editor 程序。它比 vi/vim 要简单得多，比较适合 Linux 初学者使用。某些 Linux 发行版的默认编辑器就是 nano。

  - ## 命令
    - 保存：ctrl + o
    - 搜索：ctrl + w
    - 上一页：ctrl + y
    - 下一页：ctrl + v
    - 退出：ctrl + x

## 4. Linux软件包管理

APT(Advanced Packing Tool)是Debian/Ubuntu类Linux系统中的软件包管理程序,使用它可以找到想要的软件包,而且安装、卸载、更新都很简单；也可以用来对Ubuntu进行升级；APT的源文件为 /etc/apt 目录下的sources.list文件。

### **4.1 修改数据源**

由于国内的网络环境问题,我们需要将 Ubuntu 的数据源修改为国内数据源,操作步骤如下:

- ##### 查看系统版本

  ```shell
  lsb_release -a
  ```

  输出结果为:

  ```powershell
  No LSB modules are available.
  Distributor ID:	Ubuntu
  Description:	Ubuntu 16.04 LTS
  Release:	16.04
  Codename:	xenial

  ## 注意:Codename为 xenial,该名称为我们 Ubuntu 系统的名称,修改数据源需要用到该名称
  ```

- ##### 编辑数据源

  ```shell
  vi /etc/apt/sources.list
  ```

  删除全部内容并修改为:

  ```shell
  deb http://mirrors.aliyun.com/ubuntu/ xenial main restricted universe multiverse
  deb http://mirrors.aliyun.com/ubuntu/ xenial-security main restricted universe multiverse
  deb http://mirrors.aliyun.com/ubuntu/ xenial-updates main restricted universe multiverse
  deb http://mirrors.aliyun.com/ubuntu/ xenial-backports main restricted universe multiverse
  ```

- ##### 更新数据源

  ```shell
  apt-get update
  ```

### 4.2常用数据源命令

- ##### 安装软件包

  ```shell
  apt-get install packagename
  ```

- ##### 卸载软件包

  ```shell
  apt-get remove(autoremove) packagename
  ```

- ##### 更新软件包列表

  ```shell
  apt-get update
  ```

- ##### 升级有可用更新的系统(最好不要用)

  ```shell
  apt-get upgrade
  ```

### 4.3 其它APT命令

- ##### 搜索

  ```shell
  apt-cache search package
  ```

- ##### 获取包信息

  ```shell
  apt-cache show package
  ```

- ##### 删除包及配置文件

  ```shell
  apt-get remove package --purge
  ```

- ##### 了解使用依赖

  ```shell
  apt-cache depends package
  ```

- ##### 查看被哪些包依赖

  ```shell
  apt-cache rdepends package
  ```

- ##### 安装相关的编译环境

  ```shell
  apt-get build-dep package
  ```

- ##### 下载源代码

  ```shell
  apt-get source package
  ```

- ##### 清理无用包

  ```shell
  apt-get clean && apt-get autoclean
  ```

- ##### 检查是否有损坏的依赖

  ```shell
  apt-get check
  ```

## 5.Linux用户和组管理

Linux操作系统是一个多用户操作系统,它允许多用户同时登录到系统上并使用资源。系统会根据账户来区分每个用户的文件、进程、任务和工作环境，使得每个用户工作都不受干扰。

### 5.1 使用Root用户

在实际生产操作中,我们基本上都是使用超级管理员账户操作Linux系统,也就是Root用户,Linux系统默认是关闭Root账户的,我们需要为Root用户设置一个初始密码方便我们使用。

- **设置Root账户密码**

  ```shell
  sudo passwd root
  ```

- **切换到Root**

  ```shell
  su
  ```


- **设置允许远程登录Root(Linux默认不允许Root账户远程登录)**

  ```shell
  vi /etc/ssh/sshd_config

  # Authentication:
  LoginGraceTime 120
  # PermitRootLogin prohibit-password  #注释此行
  PermitRootLogin yes  #加入此行
  StrictModes yes

  #重启服务
  service ssh restart
  ```

### 5.2 用户账户说明

- **普通用户**

  普通用户在系统上的任务都是进行普通操作


- **超级管理员**

  管理员在系统上的任务是对普通用户和整个系统进行管理。对系统拥有绝对的控制权，能够对系统进行一切操作。用root表示，root在系统中拥有最高权限，默认下Ubuntu用户的root用户是不能登录的。

- **安装时创建的系统用户**

  此用户创建时被添加到 admin 组中，在Ubuntu中，admin组中的用户默认是可以使用 **sudo** 命令来执行只有管理员才能执行的命令的。如果不使用就是一个普通用户。

### 5.3 组账户说明

- **私有组**

  当创建一个用户时没有指定属于哪个组,Linux就会建立一个与用户同名的私有组,此私有组只含有该用户。

- **标准组**

  当创建一个用户时可以选定一个标准组,如果一个用户同时属于多个组时,登录后所属的组为主组,其他的为附加组。

### 5.4 系统账户文件说明

- [ ] #### /etc/passwd

每一行代表一个账号，众多账号是系统正常运行所必须的，例如 bin，nobody 每行定义一个用户账户，此文件对所有用户可读。每行账户包含如下信息：

`root:x:0:0:root:/root:/bin/bash`

- **用户名：** 就是账号，用来对应 UID，root UID 是 0。
- **口令：** 密码，早期 UNIX 系统密码存在此字段，由于此文件所有用户都可以读取，密码容易泄露，后来这个字段数据就存放到 /etc/shadow 中，这里只能看到 X。
- **用户标示号（UID）：** 系统内唯一，root 用户的 UID 为 0，普通用户从 1000 开始，1-999 是系统的标准账户，500-65536 是可登陆账号。
- **组标示号（GID）：** 与 /etc/group 相关用来规定组名和 GID 相对应。
- **注释：** 注释账号
- **宿主目录（主文件夹）：** 用户登录系统后所进入的目录 root 在 /root/itcast
- **命令解释器（shell）：** 指定该用户使用的 shell ，默认的是 /bin/bash

- [ ] ### /etc/shadow

为了增加系统的安全性，用户口令通常用 shadow passwords 保护。只有 root 可读。每行包含如下信息：

`root:$6$Reu571.V$Ci/kd.OTzaSGU.TagZ5KjYx2MLzQv2IkZ24E1.yeTT3Pp4o/yniTjus/rRaJ92Z18MVy6suf1W5uxxurqssel.:17465:0:99999:7:::`

- **账号名称：** 需要和 /etc/passwd 一致。
- 密码：经过加密，虽然加密，但不表示不会被破解，该文件默认权限如下：
  - -rw------- 1 root root 1560 Oct 26 17:20 passwd-
  - 只有root能都读写
- **最近修改密码日期：** 从1970-1-1起，到用户最后一次更改口令的天数
- **密码最小时间间隔：** 从1970-1-1起，到用户可以更改口令的天数
- **密码最大时间间隔：** 从1970-1-1起，必须更改的口令天数
- **密码到期警告时间：** 在口令过期之前几天通知
- **密码到期后账号宽限时间**
- **密码到期禁用账户时间：** 在用户口令过期后到禁用账户的天数
- **保留**

- [ ] ### /etc/group

用户组的配置文件

`root:x:0:`

- **用户组名称**
- **用户组密码：** 给用户组管理员使用，通常不用
- **GID：** 用户组的ID
- **此用户支持的账号名称：** 一个账号可以加入多个用户组，例如想要 itcast 加入 root 这个用户组，将该账号填入该字段即可 root❌0:root, icast 将用户进行分组是 Linux 对用户进行管理及控制访问权限的一种手段。一个中可以有多个用户，一个用户可以同时属于多个组。该文件对所有用户可读。

- [ ] ### /etc/gshadow

该文件用户定义用户组口令，组管理员等信息只有root用户可读。

`root:\*::`

- **用户组名**
- **密码列**
- **用户组管理员的账号**
- **用户组所属账号**

### 5.5 账户管理常用命令

- #### 增加用户

```shell
useradd 用户名
useradd -u (UID号)
useradd -p (口令)
useradd -g (分组)
useradd -s (SHELL)
useradd -d (用户目录)
```

如：`useradd lusifer`

增加用户名为 lusifer 的账户

- #### 修改用户

```shell
usermod -u (新UID)
usermod -d (用户目录)
usermod -g (组名)
usermod -s (SHELL)
usermod -p (新口令)
usermod -l (新登录名)
usermod -L (锁定用户账号密码)
usermod -U (解锁用户账号)
```

如：`usermod -u 1024 -g group2 -G root lusifer`

将 lusifer 用户 uid 修改为 1024，默认组改为系统中已经存在的 group2，并且加入到系统管理员组

- #### 删除用户

```shell
userdel 用户名 (删除用户账号)
userdel -r 删除账号时同时删除目录

```

如：`userdel -r lusifer`

删除用户名为 lusifer 的账户并同时删除 lusifer 的用户目录

- #### 组账户维护

```shell
groupadd 组账户名 (创建新组)
groupadd -g 指定组GID
groupmod -g 更改组的GID
groupmod -n 更改组账户名
groupdel 组账户名 (删除指定组账户)
```

- #### 口令维护

```shell
passwd 用户账户名 (设置用户口令)
passwd -l 用户账户名 (锁定用户账户)
passwd -u 用户账户名 (解锁用户账户)
passwd -d 用户账户名 (删除账户口令)
gpasswd -a 用户账户名 组账户名 (将指定用户添加到指定组)
gpasswd -d 用户账户名 组账户名 (将用户从指定组中删除)
gpasswd -A 用户账户名 组账户名 (将用户指定为组的管理员)
```

- #### 用户和组状态

```shell
su 用户名(切换用户账户)
id 用户名(显示用户的UID，GID)
whoami (显示当前用户名称)
groups (显示用户所属组)
```

## 6.Linux文件权限管理

### 6.1 查看文件和目录的权限

ls –al`使用 ls 不带参数只显示文件名称，通过`ls –al` 可以显示文件或者目录的权限信息。

`ls -l 文件名` 显示信息包括：文件类型 (`d` 目录，`-` 普通文件，`l` 链接文件)，文件权限，文件的用户，文件的所属组，文件的大小，文件的创建时间，文件的名称

`-rw-r--r-- 1 lusifer lusifer 675 Oct 26 17:20 .profile`

- `-`：普通文件
- `rw-`：说明用户 lusifer 有读写权限，没有运行权限
- `r--`：表示用户组 lusifer 只有读权限，没有写和运行的权限
- `r--`：其他用户只有读权限，没有写权限和运行的权限

| -rw-r--r-- | 1    | lusifer | lusifer | 675  | Oct 26 17:20 | .profile |
| ---------- | ---- | ------- | ------- | ---- | ------------ | -------- |
| 文档类型及权限    | 连接数  | 文档所属用户  | 文档所属组   | 文档大小 | 文档最后被修改日期    | 文档名称     |

| -    | rw-           | r--              | r--           |
| ---- | ------------- | ---------------- | ------------- |
| 文档类型 | 文档所有者权限（user） | 文档所属用户组权限（group） | 其他用户权限（other） |

### 6.2 文档类型

- `d` 表示目录
- `l` 表示软连接
- `–` 表示文件
- `c` 表示串行端口字符设备文件
- `b` 表示可供存储的块设备文件
- 余下的字符 3 个字符为一组。`r` 只读，`w` 可写，`x` 可执行，`-` 表示无此权限

### 6.3 连接数

指有多少个文件指向同一个索引节点。

### 6.4 文档所属用户和所属组

就是文档属于哪个用户和用户组。文件所属用户和组是可以更改的

### 6.5 文档大小

默认是 bytes

### 6.6 更改操作权限

#### 6.6.1 chown

是 change owner 的意思，主要作用就是改变文件或者目录所有者，所有者包含用户和用户组

`chown [-R] 用户名称 文件或者目录`

`chown [-R] 用户名称 用户组名称 文件或目录`

-R：进行递归式的权限更改，将目录下的所有文件、子目录更新为指定用户组权限

#### 6.6.2 chmod

改变访问权限

`chmod [who] [+ | - | =] [mode] 文件名`

#### 6.6.3 who

表示操作对象可以是以下字母的一个或者组合

- u：用户 user
- g：用户组 group
- o：表示其他用户
- a：表示所有用户是系统默认的

#### 6.6.4 操作符号

- +：表示添加某个权限
- -：表示取消某个权限
- =：赋予给定的权限，取消文档以前的所有权限

#### 6.6.5 mode

表示可执行的权限，可以是 r、w、x

#### 6.6.6 文件名

文件名可以使空格分开的文件列表

#### 6.6.7 示例

```shell
lusifer@UbuntuBase:~$ ls -al test.txt 
-rw-rw-r-- 1 lusifer lusifer 6 Nov  2 21:47 test.txt
lusifer@UbuntuBase:~$ chmod u=rwx,g+r,o+r test.txt 
lusifer@UbuntuBase:~$ ls -al test.txt 
-rwxrw-r-- 1 lusifer lusifer 6 Nov  2 21:47 test.txt
lusifer@UbuntuBase:~$
```

### 6.7 数字设定法

数字设定法中数字表示的含义

- 0 表示没有任何权限
- 1 表示有可执行权限 = `x`
- 2 表示有可写权限 = `w`
- 4 表示有可读权限 = `r`

也可以用数字来表示权限如 chmod 755 file_name

| r w x | r – x | r - x  |
| ----- | ----- | ------ |
| 4 2 1 | 4 - 1 | 4 - 1  |
| user  | group | others |

若要 rwx 属性则 4+2+1=7

若要 rw- 属性则 4+2=6

若要 r-x 属性则 4+1=5

```
lusifer@UbuntuBase:~$ chmod 777 test.txt 
lusifer@UbuntuBase:~$ ls -al test.txt 
-rwxrwxrwx 1 lusifer lusifer 6 Nov  2 21:47 test.txt

lusifer@UbuntuBase:~$ chmod 770 test.txt 
lusifer@UbuntuBase:~$ ls -al test.txt 
-rwxrwx--- 1 lusifer lusifer 6 Nov  2 21:47 test.txt
```

![](/img/微信图片_20191119183556.png)

## 7.Linux安装Java

下载好jdk或者jre的tar包,下载地址:`http://www.oracle.com/technetwork/java/javase/downloads/index.html`

### 7.1 解压缩并移动到指定目录

- 解压缩

```shell
tar -zxvf jdk-8u181-linux-x64.tar.gz
```

- 创建目录

```shell
mkdir -p /usr/local/java
```

- 移动安装包

```shell
mv jdk1.8.0_181/ /usr/local/java/
```

- 设置所有者

```shell
chown -R root:root /usr/local/java
```

### 7.2 配置环境变量

- 配置系统环境变量

```shell
nano /etc/environment 
```

- 添加如下语句

```shell
PATH="/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games"
export JAVA_HOME=/usr/local/java/jdk1.8.0_181
export JRE_HOME=/usr/local/java/jdk1.8.0_181
export CLASSPATH=$CLASSPATH:$JAVA_HOME/lib:$JAVA_HOME/jre/lib
```

- 配置用户环境变量

```shell
nano /etc/profile
```

- 添加如下语句

```shell
export JAVA_HOME=/usr/local/java/jdk1.8.0_181
export JRE_HOME=/usr/local/java/jdk1.8.0_181
export CLASSPATH=$CLASSPATH:$JAVA_HOME/lib:$JAVA_HOME/jre/lib
export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH:$HOME/bin
```

- 使用户环境变量生效

```shell
source /etc/profile
```

- 测试是否安装成功

```shell
java -version
```

- 为其它用户更新用户环境变量

```shell
su yuxiang
source /etc/profile
```

## 8.Linux安装MySQL

### 8.1 安装

- 更新数据源

```shell
apt-get update
```

- 安装MySQL

```shell
apt-get install mysql-server
```

系统将提示在安装过程中创建root密码。选择一个安全的密码，并记住，以后会需要。

### 8.2 配置

因为是全新安装，需要运行附带的安全脚本。这会更改一些不太安全的默认选项，例如远程root登录示例用户。在旧版本MySQL上需要手动初始化数据目录，但MySQL5.7已经自动完成了。

运行安全脚本:

```shell
mysql_secure_installation
```

这将提示输入之前步骤创建的root密码,可以按Y,然后ENTER接受所有后续问题的默认值,但是要询问你是否要更改root密码,只需要在之前步骤中进行设置即可,因此无需现在更改

### 8.3 测试

- 安装完后,MySQL应该已经开始自动运行了,检查其状态

```shell
root@ubuntu:/var/lib/mysql# systemctl status mysql.service
● mysql.service - MySQL Community Server
   Loaded: loaded (/lib/systemd/system/mysql.service; enabled; vendor preset: enabled)
   Active: active (running) since Wed 2019-11-20 10:54:35 CST; 13min ago
 Main PID: 2648 (mysqld)
   CGroup: /system.slice/mysql.service
           └─2648 /usr/sbin/mysqld

Nov 20 10:54:34 ubuntu systemd[1]: Starting MySQL Community Server...
Nov 20 10:54:35 ubuntu systemd[1]: Started MySQL Community Server.
```

- 查看MySQL版本

```shell
mysql -V
mysqladmin -p -u root version
```

### 8.4 配置远程访问

- #### 修改配置文件

  ```shell
  nano /etc/mysql/mysql.conf.d/mysqld.cnf
  ```


- #### 注释掉该句

  ```shell
  bind-address = 127.0.0.1
  ```

- #### 重启mysql

  ```shell
  service mysql restart
  ```

- #### 登录mysql

  ```shell
  mysql -uroot -p
  ```

- #### 授权root用户允许所有人连接

  ```shell
  grant all privileges on *.* to 'root'@'%' identified by '你的mysql root账户密码'
  ```

### 8.3 因弱口令无法成功授权解决步骤

- 查看和设置密码安全级别

```shell
select @@validate_password_policy;
```

```shell
set global validate_password_policy=0;
```

- 查看和设置密码长度限制

```shell
select @@validate_password_length;
```

```shell
set global validate_password_length=1;
```

### 8.4 常用命令

- #### 启动

```shell
service mysql start
```

- #### 停止

```shell
service mysql stop
```

- #### 重启

```shell
service mysql restart
```

### 8.5 其它配置

- ##### 修改配置 `mysqld.cnf` 配置文件

```shell
vi /etc/mysql/mysql.conf.d/mysqld.cnf
```

- #####  配置默认字符集

在 `[mysqld]` 节点上增加如下配置

```shell
[client]
default-character-set=utf8
```

在 `[mysqld]` 节点底部增加如下配置

```shell
default-storage-engine=INNODB
character-set-server=utf8
collation-server=utf8_general_ci
```

### 8.6 配置忽略数据库大小写敏感

在 `[mysqld]` 节点底部增加如下配置

```shell
lower-case-table-names = 1
```

## 9.Linux 安装 Tomcat

下载地址:`https://tomcat.apache.org/`

### 9.1 解压缩并移动到指定目录

- #### 解压缩

```shell
tar -zxvf apache-tomcat-8.5.23.tar.gz
```

- #### 变更目录名

```shell
mv apache-tomcat-8.5.23 tomcat
```

- #### 移动目录

```shell
mv tomcat/ /usr/local/
```

### 9.2 常用命令

- #### 启动

```shell
/usr/local/tomcat/bin/startup.sh
```

- #### 停止

```shell
/usr/local/tomcat/bin/shutdown.sh
```

- #### 目录内执行脚本

```shell
./startup.sh
```