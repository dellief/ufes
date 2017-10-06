/**
 * Settings class implementation
 */

#include "Settings.h"

// Constructor
Settings::Settings()
{
    this->player = NULL;
    this->outerLimit = NULL;
    this->innerLimit = NULL;
    //this->obstacles();
}

// Draw Settings
bool Settings::read_xml(char* config_filepath)
{
    XMLDocument configDoc, arenaSvg;

    // Read the CONFIG xml file
    if(configDoc.LoadFile(config_filepath)) return false;

    // Getting ARENA file info from config file
    XMLElement* arqArena = configDoc.FirstChildElement("aplicacao")->FirstChildElement("arquivoDaArena");
    arenaName = strdup(arqArena->Attribute("nome"));
    const char* arena_type = arqArena->Attribute("tipo");
    const char* arena_path_tmp = arqArena->Attribute("caminho");
    const char* arena_filename = "arena.svg";
    char* arena_path = strdup("./");

    // char* arena_path = strdup(arena_path_tmp);

    char* arena_filepath = strcat(arena_path, arena_filename);

    printf("%s\n", arena_filepath);

    // Read the ARENA svg config file
    if(arenaSvg.LoadFile(arena_filepath)) return false;

    XMLElement* svg = arenaSvg.FirstChildElement("svg");

    for (XMLElement* circleNode = svg->FirstChildElement("circle"); circleNode != NULL; circleNode = circleNode->NextSiblingElement("circle")) {
        int x = circleNode->IntAttribute("cx");
        int y = circleNode->IntAttribute("cy");
        int r = circleNode->IntAttribute("r");
        const char* fill = circleNode->Attribute("fill");
        int id = circleNode->IntAttribute("id");

        printf("%d, %d, %d, %s, [%d]\n", x, y, r, fill, id);


        if(fill == "blue") {
            outerLimit = new Circle(r, new Point(x,y,0), new Color(0,0,1));
        }
        else if(fill == "white") {
            innerLimit = new Circle(r, new Point(x,y,0), new Color(1,1,1));
        }
        else if(fill == "green") {
            player = new Circle(r, new Point(x,y,0), new Color(0,1,0));
        }
        else if(fill == "red" || fill == "black") {
            Circle* circle = new Circle(r, new Point(x,y,0), new Color(1,0,0));
            obstacles.push_back(circle);
        }
    }

    return true;
}

// Destructor
Settings::~Settings() {}
