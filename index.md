---
# Feel free to add content and custom Front Matter to this file.
# To modify the layout, see https://jekyllrb.com/docs/themes/#overriding-theme-defaults

layout: page
---

{% assign sortedPosts = site.posts | sort: 'title' %}
{% for post in sortedPosts %}
## [{{post.title}}]({{site.baseurl}}{{post.url}})
{% endfor %}



[Get back to the repository](https://github.com/jkrude/java-begginer-lesson)

