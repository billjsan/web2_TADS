from django.urls import path
from . import views

urlpatterns = [
    path("", views.index, name="index"),
    path("visualizar/<classe>", views.visualizar, name="visualizar"),
    path("example/", views.json_example, name="json"),
    path("example2/", views.json_example2, name="json2"),

]