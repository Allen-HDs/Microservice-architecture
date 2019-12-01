# GitLab

## 1. 什么是 Git

### 1.1 概述

![img](https://www.funtl.com/assets/f7246b600c338744a9591cd7530fd9f9d62aa0f8.png)

- Git 是一个开源的分布式版本控制系统，用于敏捷高效地处理任何或小或大的项目。
- Git 是 Linus Torvalds 为了帮助管理 Linux 内核开发而开发的一个开放源码的版本控制软件。
- Git 与常用的版本控制工具 CVS, Subversion 等不同，它采用了分布式版本库的方式，不必服务器端软件支持。

## 2. 安装 Git

### 2.1 下载

下载地址：https://git-scm.com/downloads

![img](https://www.funtl.com/assets/Lusifer1511792517.png)

### 2.2 安装

双击安装文件，然后出现安装向导界面,点击下一步(Next)即可

![img](https://www.funtl.com/assets/02_WizardNext.png)

接着出现授权信息界面， Next即可

![img](https://www.funtl.com/assets/03_LicenceNext.png)

选择安装路径

![img](https://www.funtl.com/assets/04_InstallPath.png)

选择文件关联,如果你不清楚,直接默认,下一步即可

![img](https://www.funtl.com/assets/05_Associate.png)

接着出现开始菜单文件夹,默认,下一步即可

![img](https://www.funtl.com/assets/06_StartMenu.png)

然后是是否配置Path的配置,选择中间一个,可以通过 Windows命令行(CMD)调用 git 命令。 然后点击下一步

![img](https://www.funtl.com/assets/07_GitPath.png)

选择回车换行的格式。默认即可.(检出时转换为Windows风格,提交时转换为Linux风格.)

![img](https://www.funtl.com/assets/08_CRLF.png)

然后是安装进度界面

![img](https://www.funtl.com/assets/09_Installing.png)

安装完成. 去掉那个查看版本说明的复选框,点击完成(Finish)按钮即可

可以在cmd里面测试是否设置了Path,是否安装成功. 在CMD中输入 git 或者 git --version 试试

## 3. Git 的一般工作流程

- 克隆 Git 资源作为工作目录。
- 在克隆的资源上添加或修改文件。
- 如果其他人修改了，你可以更新资源。
- 在提交前查看修改。
- 提交修改。
- 在修改完成后，如果发现错误，可以撤回提交并再次修改并提交。

![](/img/git-process.png)

## 4. Git 的基本操作

### 4.1 获取与创建项目命令

#### 4.1.1 git init

用 git init 在目录中创建新的 Git 仓库。 你可以在任何时候、任何目录中这么做，完全是本地化的。

```shell
$ git init

```

#### 4.1.2 git clone

使用 git clone 拷贝一个 Git 仓库到本地，让自己能够查看该项目，或者进行修改。

```shell
$ git clone [url]

```

### 4.2 基本快照

#### 4.2.1 git add

git add 命令可将该文件添加到缓存

```shell
$ git add <filename>

```

#### 4.2.2 git status

git status 以查看在你上次提交之后是否有修改。

```shell
$ git status
$ git status -s

```

#### 4.2.3 git diff

执行 git diff 来查看执行 git status 的结果的详细信息。

git diff 命令显示已写入缓存与已修改但尚未写入缓存的改动的区别。git diff 有两个主要的应用场景。

- 尚未缓存的改动：git diff
- 查看已缓存的改动： git diff --cached
- 查看已缓存的与未缓存的所有改动：git diff HEAD
- 显示摘要而非整个 diff：git diff --stat

#### 4.2.4 git commit

使用 git add 命令将想要快照的内容写入缓存区， 而执行 git commit 将缓存区内容添加到仓库中。

Git 为你的每一个提交都记录你的名字与电子邮箱地址，所以第一步需要配置用户名和邮箱地址。

```shell
git config --global user.name 'yourname'
git config --global user.email youremail

```

将文件写入缓存区并提供提交注释

```shell
$ git commit -m 'update message'

```

#### 4.2.5 git reset HEAD

git reset HEAD 命令用于取消已缓存的内容。

```shell
$ git reset HEAD -- <filename>

```

### 4.3 拉取与推送

#### 4.3.1 git pull

git pull命令用于从另一个存储库或本地分支获取并集成(整合)。git pull命令的作用是：取回远程主机某个分支的更新，再与本地的指定分支合并，它的完整格式稍稍有点复杂。

```shell
$ git pull <远程主机名> <远程分支名>:<本地分支名>

```

将远程存储库中的更改合并到当前分支中。在默认模式下，`git pull`是`git fetch`后跟`git merge FETCH_HEAD`的缩写。更准确地说，`git pull`使用给定的参数运行`git fetch`，并调用`git merge`将检索到的分支头合并到当前分支中。

#### 4.3.2 git push

`git push`命令用于将本地分支的更新，推送到远程主机。它的格式与`git pull`命令相似。

```shell
$ git push <远程主机名> <本地分支名>:<远程分支名>

```

### 4.4 标签

#### 4.4.1 git tag

如果你达到一个重要的阶段，并希望永远记住那个特别的提交快照，你可以使用 `git tag` 给它打上标签。

比如说，我们想为我们的 商城 项目发布一个"1.0.0"版本。 我们可以用 `git tag -a v1.0.0` 命令给最新一次提交打上（HEAD） "v1.0.0" 的标签。

`-a` 选项意为"创建一个带注解的标签"。 不用 -a 选项也可以执行的，但它不会记录这标签是啥时候打的，谁打的，也不会让你添加个标签的注解。 我推荐一直创建带注解的标签。

```shell
$ git tag -a v1.0.0

```

如果我们要查看所有标签可以使用以下命令：

```shell
$ git tag
```

## 5. TortoiseGit 简化 Git 操作

TortoiseGit, 中文名海龟 Git. 海龟 Git 只支持 Windows 系统, 有一个前辈海龟 SVN, TortoiseSVN 和 TortoiseGit 都是非常优秀的开源的版本库客户端. 分为 32 位版与 64 位版.并且支持各种语言,包括简体中文

### 5.1 下载

下载地址：https://tortoisegit.org/download/

![img](https://www.funtl.com/assets/Lusifer1511792468.png)

### 5.2 安装

我们需要先安装程序包,然后安装语言包(LanguagePack). 因为TortoiseGit 只是一个程序壳,必须依赖一个 Git Core,也就是上一节我们安装的 Git. 所以安装前请确定已完成上一节的操作. 下面以64位版本为演示(64,32位除文件名不一样,其他的操作都一致)

- 双击安装程序

![img](https://www.funtl.com/assets/203_tgitWizard.png)

- 下一步,进入版权信息界面. 直接点击下一步(Next)即可

![img](https://www.funtl.com/assets/204_tgit_License.png)

- 下一步,选择SSH客户端. 可以选择 TortoiseGitPlink(位于TortoiseGit安装目录/bin 下), 也可以选择 Git 默认的SSH客户端,位于 Git安装目录/bin/ssh.exe(如果配置了 Path,那直接是 ssh.exe)

![img](https://www.funtl.com/assets/204_2_tgit_Network.png)

- 接着是选择安装目录,可以保持默认,或者安装到开发环境目录下,安装的程序组件保持默认即可

![img](https://www.funtl.com/assets/205_tgit_dir.png)

- 下一步到确认安装界面,点击 Install按钮安装即可,如下图所示

![img](https://www.funtl.com/assets/206_install_tgit.png)

- 安装完成,点击 Finish 按钮即可

![img](https://www.funtl.com/assets/207_tgit_installed.png)

### 5.3 安装语言包

双击打开语言包安装程序

![img](https://www.funtl.com/assets/208_LanguageWizard.png)

点击下一步(Alt+N), 语言包会自动安装完成

![img](https://www.funtl.com/assets/209_LangPackFinished.png)

### 5.4 配置

在空白处点击鼠标右键, 选择 --> TortoiseGit --> Settings, 然后就可以看到配置界面

![img](https://www.funtl.com/assets/Lusifer1511793790.png)

选中General,在右边的 Language中选择中文. 不勾选自动升级的复选框,可能还需要指定 Git.exe 文件的路径

再次点击鼠标右键,可以看到弹出菜单中已经变成中文. 原来的 Settings 变成 设置; Clone 变为 克隆

![img](https://www.funtl.com/assets/Lusifer1511793872.png)

## 6. 什么是 GitLab

### 6.1 概述

GitLab 是利用 Ruby on Rails 一个开源的版本管理系统，实现一个自托管的 Git 项目仓库，可通过 Web 界面进行访问公开的或者私人项目。它拥有与 Github 类似的功能，能够浏览源代码，管理缺陷和注释。可以管理团队对仓库的访问，它非常易于浏览提交过的版本并提供一个文件历史库。团队成员可以利用内置的简单聊天程序 (Wall) 进行交流。它还提供一个代码片段收集功能可以轻松实现代码复用，便于日后有需要的时候进行查找。

## 7.基于 Docker 安装 GitLab

### 7.1 安装

我们使用 Docker 来安装和运行 GitLab 中文版，由于新版本问题较多，这里我们使用目前相对稳定的 10.5 版本，`docker-compose.yml` 配置如下：

```yaml
version: '3'
services:
    web:
      image: 'twang2218/gitlab-ce-zh:10.5'
      restart: always
      hostname: '192.168.75.145'
      environment:
        TZ: 'Asia/Shanghai'
        GITLAB_OMNIBUS_CONFIG: |
          external_url 'http://192.168.75.145:8080'
          gitlab_rails['gitlab_shell_ssh_port'] = 2222
          unicorn['port'] = 8888
          nginx['listen_port'] = 8080
      ports:
        - '8080:8080'
        - '8443:443'
        - '2222:22'
      volumes:
        - /usr/local/docker/gitlab/config:/etc/gitlab
        - /usr/local/docker/gitlab/data:/var/opt/gitlab
        - /usr/local/docker/gitlab/logs:/var/log/gitlab

```

### 7.2 安装完成后的工作

- 访问地址：http://ip:8080
- 端口 8080 是因为我在配置中设置的外部访问地址为 8080，默认是 80
- 初始化安装完成后效果如下：

![img](https://www.funtl.com/assets/Lusifer1511797825.png)

- 设置管理员初始密码，这里的密码最好是 字母 + 数字 组合，并且 大于等于 8 位
- 配置完成后登录，管理员账号是 root

![img](https://www.funtl.com/assets/Lusifer1511798229.png)

**注意：** 如果服务器配置较低，启动运行可能需要较长时间，请耐心等待

## 8.GitLab 的基本设置

### 8.1 GitLab 的基本设置

第一次使用时需要做一些初始化设置，点击“管理区域”-->“设置”

![img](https://www.funtl.com/assets/Lusifer1511798480.png)

### 8.2 账户与限制设置

关闭头像功能，由于 Gravatar 头像为网络头像，在网络情况不理想时可能导致访问时卡顿

![img](https://www.funtl.com/assets/Lusifer1511798637.png)

### 8.3 注册限制

由于是内部代码托管服务器，可以直接关闭注册功能，由管理员统一创建用户即可

![img](https://www.funtl.com/assets/Lusifer1511798763.png)

## 9.GitLab 的账户管理

使用时请不要直接通过 root 用户操作，需要先创建用户，然后通过创建的用户操作，如果你是管理员还需要为其他开发人员分配账户

### 9.1 创建用户

点击“管理区域”-->“新建用户”

![img](https://www.funtl.com/assets/Lusifer1511799413.png)

### 9.2 设置账户信息

同时你可以将自己设置为管理员

![img](https://www.funtl.com/assets/Lusifer1511799508.png)

### 9.3 修改用户密码

由于我们创建时并没有配置邮箱，所以还需要重新编辑用户信息并手动设置密码

![img](https://www.funtl.com/assets/Lusifer1511799858.png)

![img](https://www.funtl.com/assets/Lusifer1511799897.png)

### 9.4 退出并使用新账户登录

![img](https://www.funtl.com/assets/Lusifer1511800022.png)

注意：创建完账户，第一次登录时还会提示你修改登录密码

## 10. GitLab 创建第一个项目

### 10.1 GitLab 创建第一个项目

点击 `+` 号 --> `新建项目`

![img](https://www.funtl.com/assets/Lusifer1511800438.png)

输入项目名称及描述信息，设置可见等级为私有，这样别人就看不见你的项目

![img](https://www.funtl.com/assets/Lusifer1511800627.png)

### 10.2 初始化项目

我们选择通过增加一个 README 的方式来初始化项目

![img](https://www.funtl.com/assets/Lusifer1511800836.png)

直接提交修改即可

![img](https://www.funtl.com/assets/Lusifer1511800904.png)

### 10.3 使用 SSH 的方式拉取和推送项目

#### 10.3.1 生成 SSH KEY

使用 ssh-keygen 工具生成，位置在 Git 安装目录下，我的是 `C:\Program Files\Git\usr\bin`

输入命令：

```powershell
$ ssh-keygen -t rsa -C "yx_endeavor@163.com"

```

执行成功后的效果：

```powershell
Microsoft Windows [版本 10.0.14393]
(c) 2016 Microsoft Corporation。保留所有权利。

C:\Program Files\Git\usr\bin>ssh-keygen -t rsa -C "topsale@vip.qq.com"
Generating public/private rsa key pair.
Enter file in which to save the key (/c/Users/Lusifer/.ssh/id_rsa):
Enter passphrase (empty for no passphrase):
Enter same passphrase again:
Your identification has been saved in /c/Users/Lusifer/.ssh/id_rsa.
Your public key has been saved in /c/Users/Lusifer/.ssh/id_rsa.pub.
The key fingerprint is:
SHA256:cVesJKa5VnQNihQOTotXUAIyphsqjb7Z9lqOji2704E topsale@vip.qq.com
The key's randomart image is:
+---[RSA 2048]----+
|  + ..=o=.  .+.  |
| o o + B .+.o.o  |
|o   . + +=o+..   |
|.=   .  oo...    |
|= o     So       |
|oE .    o        |
| .. .. .         |
| o*o+            |
| *B*oo           |
+----[SHA256]-----+

C:\Program Files\Git\usr\bin>

```

#### 10.3.2 复制 SSH-KEY 信息到 GitLab

秘钥位置在：`C:\Users\你的用户名\.ssh` 目录下，找到 `id_rsa.pub` 并使用编辑器打开，如：

![img](https://www.funtl.com/assets/Lusifer1511801618.png)

登录 GitLab，点击“用户头像”-->“设置”-->“SSH 密钥”

![img](https://www.funtl.com/assets/Lusifer1511801730.png)

成功增加密钥后的效果

![img](https://www.funtl.com/assets/Lusifer1511801884.png)

#### 10.3.3 使用 TortoiseGit 克隆项目

- 新建一个存放代码仓库的本地文件夹
- 在文件夹空白处按右键
- 选择“Git 克隆...”

![img](https://www.funtl.com/assets/Lusifer1511802101.png)

- 服务项目地址到 URL

![img](https://www.funtl.com/assets/Lusifer1511802242.png)

- 如果弹出连接信息请选择是

![img](https://www.funtl.com/assets/Lusifer1511802354.png)

- 成功克隆项目到本地

![img](https://www.funtl.com/assets/Lusifer1511802402.png)

#### 10.3.4 使用 TortoiseGit 推送项目（提交代码）

- 创建或修改文件（这里的文件为所有文件，包括：代码、图片等）
- 我们以创建 `.gitignore` 过滤配置文件为例，该文件的主要作用为过滤不需要上传的文件，比如：IDE 生成的工程文件、编译后的 class 文件等
- 在工程目录下，新建 `.gitignore` 文件，并填入如下配置：

```shell
.gradle
*.sw?
.#*
*#
*~
/build
/code
.classpath
.project
.settings
.metadata
.factorypath
.recommenders
bin
build
target
.factorypath
.springBeans
interpolated*.xml
dependency-reduced-pom.xml
build.log
_site/
.*.md.html
manifest.yml
MANIFEST.MF
settings.xml
activemq-data
overridedb.*
*.iml
*.ipr
*.iws
.idea
.DS_Store
.factorypath
dump.rdb
transaction-logs
**/overlays/
**/logs/
**/temp/
**/classes/

```

- 右键呼出菜单，选择“提交 Master...”

![img](https://www.funtl.com/assets/Lusifer1511802947.png)

- 点击“全部”并填入“日志信息”

![img](https://www.funtl.com/assets/Lusifer1511803046.png)

- 点击“提交并推送”

![img](https://www.funtl.com/assets/Lusifer1511803174.png)

- 成功后的效果图

![img](https://www.funtl.com/assets/Lusifer1511803209.png)

### 10.4 查看 GitLab 确认提交成功

![img](https://www.funtl.com/assets/Lusifer1511803280.png)

