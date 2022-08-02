from random import random

from django.http import HttpResponse, JsonResponse
from django.shortcuts import render

# Create your views here.

from django.shortcuts import render
import json
from django.views.decorators.csrf import csrf_exempt


def index(request):
    return render(request, "front_ent_SemFraude/index.html")

def visualizar(request,classe):
    return render(request, "front_ent_SemFraude/Visualizar_Itens.html",{"classe":classe})

@csrf_exempt
def json_example(request):
    data = {
        'name': 'Vitor',
        'location': 'Finland',
        'is_active': True,
        'count': 28
    }
    dump = json.dumps(data)
    return HttpResponse(dump, content_type='application/json')

def json_example2(request):
    vetor  = []
    data = {
        'id': 1,
        'name': 'Vitor',
        'location': 'Finland',
        'is_active': True,
        'count': 28
    }
    vetor.append(data)
    data = {
        'id': 2,
        'name': 'Vitor2',
        'location': 'Finlan2d',
        'is_active': True,
        'count': 28
    }

    vetor.append(data)
    
    dump = json.dumps(vetor)
    return HttpResponse(dump, content_type='application/json')
