class Instrumento:
    def _init_(self, nome, tipo):
        self.nome = nome
        self.tipo = tipo

    def tocar(self):
        raise NotImplementedError("Este método deve ser sobrescrito pelas subclasses")

class Guitarra(Instrumento):
    def _init_(self, nome, numero_de_cordas):
        super()._init_(nome, 'Corda')
        self.numero_de_cordas = numero_de_cordas

    def tocar(self):
        return f"{self.nome} está tocando com {self.numero_de_cordas} cordas."

class Piano(Instrumento):
    def _init_(self, nome, numero_de_teclas):
        super()._init_(nome, 'Teclado')
        self.numero_de_teclas = numero_de_teclas

    def tocar(self):
        return f"{self.nome} está tocando com {self.numero_de_teclas} teclas."

class Bateria(Instrumento):
    def _init_(self, nome, tamanho_do_tambor):
        super()._init_(nome, 'Percussão')
        self.tamanho_do_tambor = tamanho_do_tambor

    def tocar(self):
        return f"{self.nome} está tocando com um tambor de {self.tamanho_do_tambor} polegadas."

def demonstrar_polimorfismo(instrumentos):
    for instrumento in instrumentos:
        try:
            print(instrumento.tocar())
        except NotImplementedError as e:
            print(f"Erro: {e}")

guitarra = Guitarra("Fender Stratocaster", 6)
piano = Piano("Yamaha Grand", 88)
bateria = Bateria("Pearl Snare", 14)

instrumentos = [guitarra, piano, bateria]

demonstrar_polimorfismo(instrumentos)

try:
    instrumento_generico = Instrumento("Instrumento Genérico", "Desconhecido")
    print(instrumento_generico.tocar())
except NotImplementedError as e:
    print(f"Não pode tocar: {e}")
